.class public Le/h/d/a/a/o/a/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

.field public final b:Le/h/d/a/a/o/a/c;

.field public final c:Le/h/d/a/a/n/w/c;

.field public final d:Lfr/mbs/binary/Octets;

.field public final e:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/o/a/c;Le/h/d/a/a/n/w/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/o/a/k;->a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/o/a/k;->b:Le/h/d/a/a/o/a/c;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/o/a/k;->c:Le/h/d/a/a/n/w/c;

    .line 5
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/o/a/k;->d:Lfr/mbs/binary/Octets;

    .line 6
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/o/a/k;->e:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/o/a/k;->a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    iget-object v1, p0, Le/h/d/a/a/o/a/k;->c:Le/h/d/a/a/n/w/c;

    iget-object v2, p0, Le/h/d/a/a/o/a/k;->d:Lfr/mbs/binary/Octets;

    iget-object v3, p0, Le/h/d/a/a/o/a/k;->e:Lfr/mbs/binary/Octets;

    invoke-static {v0, p2, v1, v2, v3}, Le/h/d/a/a/o/a/j;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lfr/mbs/binary/Octets;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/o/a/b;

    move-result-object v0

    .line 2
    new-instance v1, Le/h/d/a/a/o/a/q;

    const-string v2, "process"

    const/4 v3, 0x1

    invoke-direct {v1, p0, v2, v3}, Le/h/d/a/a/o/a/q;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    invoke-interface {v0}, Le/h/d/a/a/o/a/b;->a()Le/h/d/a/a/o/a/m;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/h/d/a/a/o/a/q;->a(Ljava/lang/String;)Le/h/d/a/a/o/a/q;

    .line 3
    invoke-static {p2}, Le/h/c/a/a;->d(Lfr/mbs/binary/Octets;)Le/h/c/a/a;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Le/h/d/a/a/o/a/b;->a(Landroid/content/Context;Le/h/c/a/a;)Le/h/d/a/a/o/a/l;

    move-result-object p1

    .line 4
    iget-object v2, p0, Le/h/d/a/a/o/a/k;->b:Le/h/d/a/a/o/a/c;

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Le/h/d/a/a/o/a/l;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Le/h/d/a/a/o/a/k;->b:Le/h/d/a/a/o/a/c;

    invoke-interface {v0}, Le/h/d/a/a/o/a/b;->a()Le/h/d/a/a/o/a/m;

    move-result-object v0

    invoke-virtual {p1}, Le/h/d/a/a/o/a/l;->b()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Le/h/d/a/a/o/a/c;->a(Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V

    .line 6
    :cond_0
    invoke-virtual {v1}, Le/h/d/a/a/o/a/q;->a()V

    .line 7
    invoke-virtual {p1}, Le/h/d/a/a/o/a/l;->a()Lfr/mbs/binary/Octets;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/nfc/apdu/InvalidApduFormatException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/orange/oab/contactless/packid/h/a/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 8
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected error processing APDU "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Le/h/d/a/a/o/a/b;->b:Lfr/mbs/binary/Octets;

    invoke-direct {v0, p2, v1, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 9
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Callback execution error on APDU "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Le/h/d/a/a/o/a/b;->b:Lfr/mbs/binary/Octets;

    invoke-direct {v0, p2, v1, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p1

    .line 10
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid APDU format "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Le/h/d/a/a/o/a/b;->f:Lfr/mbs/binary/Octets;

    invoke-direct {v0, p2, v1, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw v0
.end method
