.class public Le/h/d/a/a/s/a0;
.super Le/h/d/a/a/s/k0/o;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    .line 1
    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 7

    const-string v0, "id"

    .line 1
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v0, "zoneId"

    .line 2
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v3

    .line 3
    new-instance v5, Ljava/util/Date;

    const-string v0, "transactionDate"

    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    const-string v0, "amountInCents"

    .line 4
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const-string v1, "description"

    .line 5
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 6
    new-instance p1, Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V

    return-object p1
.end method
