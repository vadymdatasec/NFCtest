.class public Lcom/orange/oab/contactless/packid/hce/user/User;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONTACTLESS_ID_LENGTH:I = 0x4

.field public static final DEFAULT_CONTACTLESS_ID:Ljava/lang/String; = "00000001"

.field public static final DEFAULT_USER_EMAIL:Ljava/lang/String; = "user@default.fr"

.field public static final DEFAULT_USER_FIRSTNAME:Ljava/lang/String; = "User"

.field public static final DEFAULT_USER_LASTNAME:Ljava/lang/String; = "Default"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

.field public e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lfr/mbs/binary/Octets;

.field public g:Lfr/mbs/binary/Octets;

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

.field public k:Z

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    return-void
.end method

.method public static defaultUser(Landroid/content/Context;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V

    .line 2
    invoke-static {p0}, Le/h/d/a/a/n/w/c;->c(Landroid/content/Context;)Le/h/d/a/a/n/w/c;

    move-result-object v1

    .line 3
    invoke-static {p0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->defaultWallet(Landroid/content/Context;Le/h/d/a/a/n/w/c;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v1

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    const-string v1, "User"

    .line 4
    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->a:Ljava/lang/String;

    const-string v1, "Default"

    .line 5
    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->b:Ljava/lang/String;

    const-string v1, "user@default.fr"

    .line 6
    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->c:Ljava/lang/String;

    const-string v1, "00000001"

    .line 7
    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->f:Lfr/mbs/binary/Octets;

    .line 8
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->defaultTenant(Landroid/content/Context;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p0

    iput-object p0, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->j:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    const/4 p0, 0x1

    .line 9
    iput-boolean p0, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->k:Z

    const/4 p0, 0x0

    .line 10
    iput-boolean p0, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->l:Z

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/net/Uri;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/String;

    invoke-static {p1}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;)Le/h/d/a/a/n/w/c;

    move-result-object p1

    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Le/h/d/a/a/n/w/c;->b([B)[B

    move-result-object p1

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/orange/oab/contactless/packid/hce/user/User;

    if-eq v3, v2, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 3
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->g:Lfr/mbs/binary/Octets;

    iget-object p1, p1, Lcom/orange/oab/contactless/packid/hce/user/User;->g:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_2

    invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public getApplicationIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->e:Ljava/util/Set;

    return-object v0
.end method

.method public getCipheredUri()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->g:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getContactlessId()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->f:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getLastname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->j:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    return-object v0
.end method

.method public getUri(Landroid/content/Context;)Landroid/net/Uri;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->a(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->g:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isDefault()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->g:Lfr/mbs/binary/Octets;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isFirebaseEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->k:Z

    return v0
.end method

.method public isPremium()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->l:Z

    return v0
.end method

.method public isSendEnrolmentNotification()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->m:Z

    return v0
.end method

.method public isSimCentric()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->i:Z

    return v0
.end method

.method public setApplicationIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->e:Ljava/util/Set;

    return-void
.end method

.method public setCipheredUri(Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->g:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public setContactlessId(Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->f:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->c:Ljava/lang/String;

    return-void
.end method

.method public setFirebaseEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->k:Z

    return-void
.end method

.method public setFirstname(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->a:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->h:Ljava/lang/String;

    return-void
.end method

.method public setLastname(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->b:Ljava/lang/String;

    return-void
.end method

.method public setPremium(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->l:Z

    return-void
.end method

.method public setSendEnrolmentNotification(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->m:Z

    return-void
.end method

.method public setSimCentric(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->i:Z

    return-void
.end method

.method public setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->j:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    return-void
.end method

.method public setUri(Landroid/net/Uri;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;)Le/h/d/a/a/n/w/c;

    move-result-object p2

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p2, p1}, Le/h/d/a/a/n/w/c;->a([B)[B

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V

    return-void
.end method

.method public setWallet(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    return-void
.end method
