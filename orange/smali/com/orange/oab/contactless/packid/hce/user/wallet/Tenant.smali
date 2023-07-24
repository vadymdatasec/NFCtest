.class public Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z

    .line 3
    iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z

    .line 6
    iput-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z

    .line 7
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->b:Ljava/lang/String;

    return-void
.end method

.method public static defaultTenant(Landroid/content/Context;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
    .locals 2

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>()V

    .line 2
    sget v1, Le/h/d/a/a/c;->default_tenant_name:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setName(Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 3
    iput-boolean p0, v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    if-eq v1, v0, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    .line 3
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getLogoUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->b:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->c:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isDefault()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->e:Z

    return v0
.end method

.method public setLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->c:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->b:Ljava/lang/String;

    return-void
.end method

.method public setShouldSendEnrollmentNotification(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z

    return-void
.end method

.method public shouldSendEnrollmentNotification()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->d:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Tenant{name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", logoUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
