CREATE TABLE Kinobillett
(
    id        INTEGER AUTO_INCREMENT NOT NULL,
    film      VARCHAR(50)  NOT NULL,
    antall    INTEGER      NOT NULL,
    fornavn   VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    telefonnr INTEGER      NOT NULL,
    epost     VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);