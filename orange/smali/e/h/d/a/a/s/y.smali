.class public Le/h/d/a/a/s/y;
.super Le/h/d/a/a/s/k0/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/h/d/a/a/s/k0/z<",
        "Lcom/orange/oab/contactless/packid/domain/Transaction;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/orange/oab/contactless/packid/domain/Transaction;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/c0;Lcom/orange/oab/contactless/packid/domain/Transaction;Ljava/lang/String;Lcom/orange/oab/contactless/packid/domain/Transaction;)V
    .locals 0

    .line 1
    iput-object p4, p0, Le/h/d/a/a/s/y;->c:Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-direct {p0, p2, p3}, Le/h/d/a/a/s/k0/z;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/orange/oab/contactless/packid/domain/Transaction;)Landroid/content/ContentValues;
    .locals 2

    .line 2
    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    .line 3
    iget-object v0, p0, Le/h/d/a/a/s/y;->c:Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "id"

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Le/h/d/a/a/s/y;->c:Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    const-string v1, "zoneId"

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Le/h/d/a/a/s/y;->c:Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "transactionDate"

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 6
    iget-object v0, p0, Le/h/d/a/a/s/y;->c:Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getAmountInCents()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "amountInCents"

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 7
    iget-object v0, p0, Le/h/d/a/a/s/y;->c:Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDescription()Ljava/lang/String;

    move-result-object v0

    const-string v1, "description"

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Landroid/content/ContentValues;
    .locals 0

    .line 1
    check-cast p1, Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-virtual {p0, p1}, Le/h/d/a/a/s/y;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)Landroid/content/ContentValues;

    move-result-object p1

    return-object p1
.end method
