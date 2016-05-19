CREATE TABLE [dbo].[Purchase] (
    [purchaseid] INT   NOT NULL IDENTITY,
    [userid]     INT   NOT NULL,
    [productid]  INT   NOT NULL,
    [price]      MONEY NOT NULL,
    PRIMARY KEY CLUSTERED ([purchaseid] ASC),
    CONSTRAINT [FK_Purchase_User] FOREIGN KEY ([userid]) REFERENCES [dbo].[User] ([userid]),
    CONSTRAINT [FK_Purchase_Product] FOREIGN KEY ([productid]) REFERENCES [dbo].[Product] ([productid])
);

