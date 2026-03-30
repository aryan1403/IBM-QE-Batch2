describe('testing contact form', () => {
    beforeEach(() => {
        cy.visit('http://localhost:3000/');
    })

    it('test the title of the contact form', () => {
        const heading = cy.get('h1');
        // heading.should('have.text', '&nbsp;< Contact Us');

        cy.get('#exampleFormControlInput1').type('aaryan@gmail.com');
        cy.get('#exampleFormControlTextarea1').type('pass1234567890');

        cy.get('.btn-primary').click();
        cy.on('window:alert', text => 
            expect(text).to.eq('Thank you for contacting us! We will get back to you soon.')
        )
    })

    it('testing basics', () => {
        // cy.wait(5000) 
        cy.url().should("include", "/")
        cy.title().should("eq", "Pet Shop - Contact")

        cy.fixture("example.json").then((user) => {
            cy.get('.container').within(() => {
                cy.get('#exampleFormControlInput1').type(user.email);
                cy.get('#exampleFormControlTextarea1').type(user.body);

                cy.get('.btn-primary').click();
                cy.on('window:alert', text => 
                    expect(text).to.eq('Thank you for contacting us! We will get back to you soon.')
                )
        });
        })
    });

    it('testing the health endpoint', () => {
        cy.request("GET", "/health").then((response) => {  
            console.log(response);
        });
        // console.log(data);
    })
})