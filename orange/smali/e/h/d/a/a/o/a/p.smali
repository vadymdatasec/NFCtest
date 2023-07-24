.class public Le/h/d/a/a/o/a/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/h/d/a/a/o/a/b;


# instance fields
.field public final i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

.field public final j:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/o/a/p;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/o/a/p;->j:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 2
    new-instance p1, Le/h/d/a/a/o/a/l;

    invoke-virtual {p0}, Le/h/d/a/a/o/a/p;->c()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-direct {p1, p2}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;)V

    return-object p1
.end method

.method public a()Le/h/d/a/a/o/a/m;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/o/a/m;->c:Le/h/d/a/a/o/a/m;

    return-object v0
.end method

.method public final b()Lfr/mbs/binary/Octets;
    .locals 1

    const/16 v0, 0x10

    .line 1
    invoke-static {v0}, Lfr/mbs/binary/Octets;->random(I)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lfr/mbs/binary/Octets;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/o/a/p;->j:Lfr/mbs/binary/Octets;

    iget-object v1, p0, Le/h/d/a/a/o/a/p;->j:Lfr/mbs/binary/Octets;

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    .line 2
    iget-object v0, p0, Le/h/d/a/a/o/a/p;->j:Lfr/mbs/binary/Octets;

    invoke-virtual {p0}, Le/h/d/a/a/o/a/p;->b()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    .line 3
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/o/a/p;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/o/a/p;->j:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/o/a/b;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/a; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 4
    new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a;

    sget-object v2, Le/h/d/a/a/o/a/b;->d:Lfr/mbs/binary/Octets;

    const-string v3, "No wallet available for select"

    invoke-direct {v1, v3, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw v1
.end method
