.class public Lcom/orange/oab/contactless/packid/domain/Transaction;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Date;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/String;

.field public final e:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lfr/mbs/binary/Octets;)V
    .locals 7

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->d:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->e:Lfr/mbs/binary/Octets;

    .line 6
    iput-object p3, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->a:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->b:Ljava/util/Date;

    .line 8
    iput-object p5, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->c:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getAmountInCents()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->b:Ljava/util/Date;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getZoneId()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->e:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Le/f/b/a/j;->a(Ljava/lang/Object;)Le/f/b/a/j$a;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->a:Ljava/lang/String;

    const-string v2, "description"

    .line 2
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->b:Ljava/util/Date;

    const-string v2, "date"

    .line 3
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->c:Ljava/lang/Integer;

    const-string v2, "amountInCents"

    .line 4
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->d:Ljava/lang/String;

    const-string v2, "id"

    .line 5
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/Transaction;->e:Lfr/mbs/binary/Octets;

    const-string v2, "zoneId"

    .line 6
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    .line 7
    invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
