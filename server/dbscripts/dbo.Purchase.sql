CREATE TABLE [dbo].[Purchase]
(
	[purchaseid] INT NOT NULL PRIMARY KEY, 
    [userid] INT NOT NULL, 
    [productid] INT NOT NULL, 
    CONSTRAINT [FK_Purchase_User] FOREIGN KEY ([userid]) REFERENCES [user]([userid]), 
    CONSTRAINT [FK_Purchase_Product] FOREIGN KEY ([productid]) REFERENCES [product]([productid])
)
