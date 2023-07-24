.class public Le/h/d/a/a/w/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/h/d/a/a/o/a/c;


# instance fields
.field public a:Ljava/util/Date;

.field public final b:Landroid/content/Context;

.field public final c:Le/h/d/a/a/o/a/q;

.field public d:Le/h/d/a/a/o/a/k;

.field public e:Lfr/mbs/binary/Octets;

.field public f:Z

.field public g:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

.field public h:Z

.field public i:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Object;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public j:Z

.field public k:Z

.field public l:Lcom/orange/oab/contactless/packid/hce/user/User;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Le/h/d/a/a/w/m;->k:Z

    .line 3
    new-instance v1, Le/h/d/a/a/o/a/q;

    const-string v2, "process"

    invoke-direct {v1, p0, v2, v0}, Le/h/d/a/a/o/a/q;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    const-string v0, "session"

    invoke-virtual {v1, v0}, Le/h/d/a/a/o/a/q;->a(Ljava/lang/String;)Le/h/d/a/a/o/a/q;

    iput-object v1, p0, Le/h/d/a/a/w/m;->c:Le/h/d/a/a/o/a/q;

    .line 4
    iput-object p1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/w/m;Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/w/m;->b(Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 4

    .line 12
    iget-object v0, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    sget v1, Le/h/d/a/a/c;->nfc_transaction_failed:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/orange/oab/contactless/packid/report/ReportSender;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "error ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "packid.nfc.NfcSession"

    invoke-static {v0, p2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    instance-of p2, p1, Lcom/orange/oab/contactless/packid/h/a/o;

    if-nez p2, :cond_0

    .line 15
    invoke-static {p1}, Lm/a/a/c/f/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_0
    instance-of p2, p1, Lcom/orange/oab/contactless/packid/h/a/a;

    if-eqz p2, :cond_1

    .line 17
    check-cast p1, Lcom/orange/oab/contactless/packid/h/a/a;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/h/a/a;->b()Z

    move-result p1

    iput-boolean p1, p0, Le/h/d/a/a/w/m;->j:Z

    :cond_1
    return-object p3
.end method

.method public a()V
    .locals 3

    .line 21
    :try_start_0
    invoke-virtual {p0}, Le/h/d/a/a/w/m;->d()V

    .line 22
    iget-boolean v0, p0, Le/h/d/a/a/w/m;->f:Z

    if-eqz v0, :cond_0

    .line 23
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    .line 24
    :cond_0
    iget-boolean v0, p0, Le/h/d/a/a/w/m;->j:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Le/h/d/a/a/w/m;->k:Z

    if-nez v0, :cond_1

    .line 25
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    .line 26
    :cond_1
    iget-object v0, p0, Le/h/d/a/a/w/m;->g:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    if-eqz v0, :cond_2

    .line 27
    new-instance v0, Le/h/d/a/a/n/n;

    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    iget-object v2, p0, Le/h/d/a/a/w/m;->g:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-direct {v0, v1, v2}, Le/h/d/a/a/n/n;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v0}, Le/h/d/a/a/n/n;->a()V

    .line 28
    :cond_2
    iget-object v0, p0, Le/h/d/a/a/w/m;->c:Le/h/d/a/a/o/a/q;

    invoke-virtual {v0}, Le/h/d/a/a/o/a/q;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 29
    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    sget v2, Le/h/d/a/a/c;->error_while_closing_nfc:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/orange/oab/contactless/packid/report/ReportSender;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 6

    const-string v0, "packid.nfc.NfcSession"

    .line 30
    :try_start_0
    new-instance v1, Le/h/d/a/a/k/a;

    invoke-direct {v1}, Le/h/d/a/a/k/a;-><init>()V

    .line 31
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v2

    .line 32
    iget-object v3, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-static {v3}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v3

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Le/h/d/a/a/s/g0;->a(Ljava/lang/String;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v3

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v3

    .line 33
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v1, p1, v2, v3}, Le/h/d/a/a/k/a;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Lcom/orange/oab/contactless/packid/domain/Transaction;

    move-result-object p1

    .line 34
    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-static {v1}, Le/h/d/a/a/s/m;->b(Landroid/content/Context;)Le/h/d/a/a/s/c0;

    move-result-object v1

    invoke-virtual {v1, p1}, Le/h/d/a/a/s/c0;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/orange/oab/contactless/packid/domain/a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/orange/oab/contactless/packid/domain/b; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "Initialization transaction, no need to persist"

    .line 35
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    const-string p1, "Transaction already commited, no need to persist"

    .line 36
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_2
    move-exception p1

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown application data in token, transaction will not be persisted ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public a(Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V
    .locals 4

    .line 18
    new-instance v0, Le/h/d/a/a/w/k;

    invoke-direct {v0, p0, p1, p2}, Le/h/d/a/a/w/k;-><init>(Le/h/d/a/a/w/m;Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V

    iput-object v0, p0, Le/h/d/a/a/w/m;->i:Landroid/os/AsyncTask;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    .line 19
    invoke-virtual {v0, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object p1, p0, Le/h/d/a/a/w/m;->a:Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "ms"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "packid.nfc.NfcSession"

    invoke-static {p2, p1}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 6
    iget-object v0, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 7
    iput-object p1, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 8
    iget-object v0, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Le/h/d/a/a/n/w/c;->a(Landroid/content/Context;Z)Le/h/d/a/a/n/w/c;

    move-result-object v0

    .line 9
    new-instance v1, Le/h/d/a/a/o/a/k;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object p1

    invoke-direct {v1, p1, p0, v0}, Le/h/d/a/a/o/a/k;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/o/a/c;Le/h/d/a/a/n/w/c;)V

    iput-object v1, p0, Le/h/d/a/a/w/m;->d:Le/h/d/a/a/o/a/k;

    return-void

    .line 10
    :cond_0
    new-instance p1, Le/h/d/a/a/r/a;

    iget-object v0, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-direct {p1, v0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    iget-object v2, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    sget v3, Le/h/d/a/a/c;->error_user_not_available:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    .line 11
    new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a;

    sget-object v0, Le/h/d/a/a/o/a/b;->d:Lfr/mbs/binary/Octets;

    const-string v1, "No user available for NFC transaction"

    invoke-direct {p1, v1, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p1
.end method

.method public a([B)[B
    .locals 1

    .line 2
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/w/m;->a:Ljava/util/Date;

    .line 3
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 2

    .line 22
    iget-object v0, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 1
    sget-object v0, Le/h/d/a/a/o/a/j;->d:Le/h/d/a/a/o/a/j;

    invoke-virtual {v0, p1}, Le/h/d/a/a/o/a/j;->a(Lfr/mbs/binary/Octets;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Le/h/c/a/a;->d(Lfr/mbs/binary/Octets;)Le/h/c/a/a;

    move-result-object p1

    invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session started with a non select APDU: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Le/h/d/a/a/o/a/b;->d:Lfr/mbs/binary/Octets;

    invoke-direct {v0, p1, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw v0
.end method

.method public final b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 5

    if-eqz p1, :cond_0

    .line 19
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 20
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isTransactionAllowed()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 21
    iget-object p1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-static {p1}, Le/h/d/a/a/s/m;->b(Landroid/content/Context;)Le/h/d/a/a/s/c0;

    move-result-object p1

    new-instance v0, Lcom/orange/oab/contactless/packid/domain/Transaction;

    iget-object v1, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {p1, v0}, Le/h/d/a/a/s/c0;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)V

    :cond_1
    return-void
.end method

.method public final b(Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V
    .locals 8

    .line 4
    sget-object v0, Le/h/d/a/a/o/a/m;->c:Le/h/d/a/a/o/a/m;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Le/h/d/a/a/w/m;->k:Z

    if-eqz p2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    :goto_0
    iput-object p2, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    .line 6
    invoke-virtual {p0}, Le/h/d/a/a/w/m;->b()Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v5

    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "commandType:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "packid.nfc.NfcSession"

    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v5, :cond_1

    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "No badge found on NFC session success for zone id "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 9
    :cond_1
    sget-object p2, Le/h/d/a/a/w/l;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget p2, p2, v2

    if-eq p2, v1, :cond_6

    const/4 v2, 0x2

    if-eq p2, v2, :cond_5

    const/4 v2, 0x3

    if-eq p2, v2, :cond_4

    const/4 v1, 0x4

    if-eq p2, v1, :cond_3

    const/4 v1, 0x5

    if-eq p2, v1, :cond_2

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown NFC Command : "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 11
    :cond_2
    invoke-virtual {p0, v5}, Le/h/d/a/a/w/m;->c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 12
    new-instance v2, Le/h/d/a/a/w/g;

    invoke-direct {v2}, Le/h/d/a/a/w/g;-><init>()V

    iget-object v3, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    iget-object v4, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    const-string v6, "OK"

    const-string v7, "NFC"

    invoke-virtual/range {v2 .. v7}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 13
    :cond_3
    invoke-virtual {p0, v5}, Le/h/d/a/a/w/m;->e(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    goto :goto_1

    .line 14
    :cond_4
    iput-boolean v1, p0, Le/h/d/a/a/w/m;->h:Z

    .line 15
    iput-boolean v1, p0, Le/h/d/a/a/w/m;->f:Z

    goto :goto_1

    .line 16
    :cond_5
    invoke-virtual {p0, v5}, Le/h/d/a/a/w/m;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 17
    new-instance v2, Le/h/d/a/a/w/g;

    invoke-direct {v2}, Le/h/d/a/a/w/g;-><init>()V

    iget-object v3, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    iget-object v4, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    const-string v6, "OK"

    const-string v7, "NFC"

    invoke-virtual/range {v2 .. v7}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 18
    :cond_6
    new-instance p1, Le/h/d/a/a/r/a;

    iget-object p2, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-direct {p1, p2}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object p2, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {p1, p2, v0, v1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;I)V

    :goto_1
    return-void
.end method

.method public final c()Lfr/mbs/binary/Octets;
    .locals 1

    .line 10
    iget-object v0, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Le/h/d/a/a/w/m;->d()V

    .line 2
    iget-object v0, p0, Le/h/d/a/a/w/m;->d:Le/h/d/a/a/o/a/k;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->a(Lfr/mbs/binary/Octets;)V

    .line 4
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/w/m;->d:Le/h/d/a/a/o/a/k;

    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Le/h/d/a/a/o/a/k;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/i; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/orange/oab/contactless/packid/h/a/a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/o/a/b;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    return-object v1

    :catch_1
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/h/a/a;->a()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    return-object v1

    :catch_2
    move-exception p1

    .line 7
    sget-object v0, Le/h/d/a/a/o/a/b;->b:Lfr/mbs/binary/Octets;

    const-string v1, "Encryptor not available"

    invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    return-object v0

    :catch_3
    move-exception p1

    .line 8
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/w/m;->e:Lfr/mbs/binary/Octets;

    iget-object v3, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    sget v4, Le/h/d/a/a/c;->error_security_configuration_modified:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    .line 9
    sget-object v0, Le/h/d/a/a/o/a/b;->b:Lfr/mbs/binary/Octets;

    const-string v1, "Unexpected encryptor initialisation"

    invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public final c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 4

    .line 11
    iget-boolean v0, p0, Le/h/d/a/a/w/m;->h:Z

    if-eqz v0, :cond_0

    .line 12
    invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->d(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 13
    :cond_0
    invoke-static {}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->dismissTransactionNotification()V

    if-eqz p1, :cond_1

    .line 14
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Le/h/d/a/a/w/m;->f:Z

    .line 16
    iput-boolean p1, p0, Le/h/d/a/a/w/m;->h:Z

    return-void
.end method

.method public final d()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/h/d/a/a/w/m;->i:Landroid/os/AsyncTask;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/AsyncTask;->get()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final d(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 2
    iget-object v0, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 3
    iput-object p1, p0, Le/h/d/a/a/w/m;->g:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    :cond_0
    return-void
.end method

.method public final e(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/h/d/a/a/w/m;->b:Landroid/content/Context;

    iget-object v1, p0, Le/h/d/a/a/w/m;->l:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-static {v0, v1, p1}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->setupAbortionTimeout(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/h/d/a/a/w/m;->f:Z

    .line 3
    iput-boolean v0, p0, Le/h/d/a/a/w/m;->h:Z

    .line 4
    invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->d(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    return-void
.end method
