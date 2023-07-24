.class public Le/h/b/a/m/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final C:Lfr/mbs/binary/Octets;


# instance fields
.field public A:Z

.field public B:Z

.field public final b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

.field public c:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public d:Ljava/lang/String;

.field public e:Lfr/mbs/binary/Octets;

.field public f:Z

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Le/h/b/a/p/i;

.field public j:Z

.field public k:Lfr/mbs/binary/Octets;

.field public l:Z

.field public m:Z

.field public n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

.field public o:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

.field public p:Z

.field public q:Z

.field public r:Ljava/lang/String;

.field public s:Le/h/b/a/m/i;

.field public t:Ljava/lang/String;

.field public u:Z

.field public v:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

.field public w:Z

.field public x:Z

.field public final y:Le/h/b/a/m/a;

.field public z:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "534f474550BB"

    .line 1
    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    sput-object v0, Le/h/b/a/m/d;->C:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Le/h/b/a/m/c;->d:Le/h/b/a/m/c;

    .line 3
    sget-object v0, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    iput-object v0, p0, Le/h/b/a/m/d;->s:Le/h/b/a/m/i;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Le/h/b/a/m/d;->w:Z

    .line 5
    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    iput-object v1, p0, Le/h/b/a/m/d;->z:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 6
    iput-boolean v0, p0, Le/h/b/a/m/d;->B:Z

    .line 7
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->d:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->e:Lfr/mbs/binary/Octets;

    .line 9
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isActive()Z

    move-result v0

    iput-boolean v0, p0, Le/h/b/a/m/d;->f:Z

    .line 10
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isTransactionAllowed()Z

    move-result v0

    iput-boolean v0, p0, Le/h/b/a/m/d;->j:Z

    .line 11
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->k:Lfr/mbs/binary/Octets;

    .line 12
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z

    move-result v0

    iput-boolean v0, p0, Le/h/b/a/m/d;->l:Z

    .line 13
    invoke-virtual {p1, p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isDefault(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Le/h/b/a/m/d;->m:Z

    .line 14
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getStatus()Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 15
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->o:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    .line 16
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isManualConnectionAllowed()Z

    move-result v0

    iput-boolean v0, p0, Le/h/b/a/m/d;->p:Z

    .line 17
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z

    move-result v0

    iput-boolean v0, p0, Le/h/b/a/m/d;->q:Z

    .line 18
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->v:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    .line 19
    sget-object v0, Le/h/b/a/m/a;->b:Le/h/b/a/m/a;

    iput-object v0, p0, Le/h/b/a/m/d;->y:Le/h/b/a/m/a;

    .line 20
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getLogoFile()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getMaskedId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->g:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v0

    iput-object v0, p0, Le/h/b/a/m/d;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 23
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1, p2}, Lcom/orange/business/packid/android/lib/PackId;->forceStatusUpdateForBadge(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)Z

    move-result p2

    iput-boolean p2, p0, Le/h/b/a/m/d;->x:Z

    .line 24
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isLockable()Z

    move-result p2

    iput-boolean p2, p0, Le/h/b/a/m/d;->A:Z

    .line 25
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isLocked()Z

    move-result p2

    iput-boolean p2, p0, Le/h/b/a/m/d;->B:Z

    .line 26
    iput-object p1, p0, Le/h/b/a/m/d;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 27
    invoke-virtual {p0, p1, p3}, Le/h/b/a/m/d;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;Lfr/mbs/binary/Octets;Z)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-object v0, Le/h/b/a/m/c;->d:Le/h/b/a/m/c;

    .line 30
    sget-object v0, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    iput-object v0, p0, Le/h/b/a/m/d;->s:Le/h/b/a/m/i;

    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Le/h/b/a/m/d;->w:Z

    .line 32
    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    iput-object v1, p0, Le/h/b/a/m/d;->z:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 33
    iput-boolean v0, p0, Le/h/b/a/m/d;->B:Z

    .line 34
    iput-object p1, p0, Le/h/b/a/m/d;->v:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    .line 35
    iput-object p2, p0, Le/h/b/a/m/d;->k:Lfr/mbs/binary/Octets;

    if-eqz p3, :cond_0

    .line 36
    sget-object p1, Le/h/b/a/m/a;->c:Le/h/b/a/m/a;

    iput-object p1, p0, Le/h/b/a/m/d;->y:Le/h/b/a/m/a;

    goto :goto_0

    .line 37
    :cond_0
    sget-object p1, Le/h/b/a/m/a;->d:Le/h/b/a/m/a;

    iput-object p1, p0, Le/h/b/a/m/d;->y:Le/h/b/a/m/a;

    :goto_0
    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Le/h/b/a/m/d;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->l:Z

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, p0, Le/h/b/a/m/d;->f:Z

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLING:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->j:Z

    return v0
.end method

.method public final a(Landroid/widget/ImageView;)I
    .locals 3

    .line 4
    iget-object v0, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "connection"

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "drawable"

    invoke-virtual {v1, v0, v2, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public a()Lfr/mbs/binary/Octets;
    .locals 1

    .line 3
    iget-object v0, p0, Le/h/b/a/m/d;->e:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public a(Landroid/widget/TextView;)V
    .locals 2

    .line 7
    iget-boolean v0, p0, Le/h/b/a/m/d;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x2

    const/high16 v1, 0x41600000    # 14.0f

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 10
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f05001f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    :goto_1
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Le/h/b/a/m/d;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Le/h/b/a/m/d;->l()I

    move-result v1

    invoke-static {v0, v1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isDefault(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    new-instance p2, Ljava/math/BigInteger;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getMaskedId()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x10

    invoke-direct {p2, p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p2}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/h/b/a/m/d;->r:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
    .locals 0

    .line 16
    iput-object p1, p0, Le/h/b/a/m/d;->z:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-void
.end method

.method public a(Le/h/b/a/m/i;)V
    .locals 0

    .line 15
    iput-object p1, p0, Le/h/b/a/m/d;->s:Le/h/b/a/m/i;

    return-void
.end method

.method public a(Le/h/b/a/p/i;)V
    .locals 0

    .line 18
    iput-object p1, p0, Le/h/b/a/m/d;->i:Le/h/b/a/p/i;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 17
    iput-boolean p1, p0, Le/h/b/a/m/d;->x:Z

    return-void
.end method

.method public a(Landroid/content/Context;)Z
    .locals 1

    .line 19
    iget-object v0, p0, Le/h/b/a/m/d;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-static {p1, v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->canUseBleForBadge(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p1

    return p1
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 2

    .line 14
    iget-object v0, p0, Le/h/b/a/m/d;->d:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->FRENCH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->FRENCH:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Le/h/b/a/m/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Le/h/b/a/m/d;->a(Landroid/widget/ImageView;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Le/h/b/a/d;->a(Landroid/view/View;)Le/h/b/a/g;

    move-result-object v1

    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Le/h/b/a/g;->a(Ljava/lang/Integer;)Le/h/b/a/f;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Le/h/b/a/f;->b()Le/h/b/a/f;

    move-result-object v0

    const v1, 0x7f07008e

    .line 5
    invoke-virtual {v0, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 8
    iput-object p1, p0, Le/h/b/a/m/d;->t:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 7
    iput-boolean p1, p0, Le/h/b/a/m/d;->u:Z

    return-void
.end method

.method public b(Landroid/content/Context;)Z
    .locals 1

    .line 9
    iget-object v0, p0, Le/h/b/a/m/d;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-static {p1, v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->canUseNfcForBadge(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p1

    return p1
.end method

.method public c()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
    .locals 1

    .line 7
    iget-object v0, p0, Le/h/b/a/m/d;->o:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    return-object v0
.end method

.method public final c(Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    invoke-static {p1}, Le/h/b/a/d;->a(Landroid/view/View;)Le/h/b/a/g;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    .line 2
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/b/a/g;->a(Landroid/net/Uri;)Le/h/b/a/f;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Le/h/b/a/f;->b()Le/h/b/a/f;

    move-result-object v0

    sget-object v1, Le/b/a/y/x/c0;->c:Le/b/a/y/x/c0;

    .line 4
    invoke-virtual {v0, v1}, Le/h/b/a/f;->a(Le/b/a/y/x/c0;)Le/h/b/a/f;

    move-result-object v0

    const v1, 0x7f07008e

    .line 5
    invoke-virtual {v0, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 8
    iput-boolean p1, p0, Le/h/b/a/m/d;->w:Z

    return-void
.end method

.method public d()Lfr/mbs/binary/Octets;
    .locals 1

    .line 6
    iget-object v0, p0, Le/h/b/a/m/d;->k:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public d(Landroid/widget/ImageView;)V
    .locals 3

    const v0, 0x7f08014e

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {v1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0, p1}, Le/h/b/a/m/d;->c(Landroid/widget/ImageView;)V

    goto :goto_1

    .line 4
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Le/h/b/a/m/d;->b(Landroid/widget/ImageView;)V

    .line 5
    :goto_1
    iget-object v1, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 7
    iput-boolean p1, p0, Le/h/b/a/m/d;->B:Z

    return-void
.end method

.method public e()Le/h/b/a/p/i;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->i:Le/h/b/a/p/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/h/b/a/m/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Le/h/b/a/m/d;

    .line 3
    iget-object v1, p0, Le/h/b/a/m/d;->y:Le/h/b/a/m/a;

    sget-object v3, Le/h/b/a/m/a;->d:Le/h/b/a/m/a;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4
    iget-object v1, p0, Le/h/b/a/m/d;->v:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v3

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lm/a/a/c/e;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Le/h/b/a/m/d;->v:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lm/a/a/c/e;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 5
    :cond_3
    iget-boolean v1, p0, Le/h/b/a/m/d;->f:Z

    iget-boolean v3, p1, Le/h/b/a/m/d;->f:Z

    if-ne v1, v3, :cond_4

    iget-boolean v1, p0, Le/h/b/a/m/d;->j:Z

    iget-boolean v3, p1, Le/h/b/a/m/d;->j:Z

    if-ne v1, v3, :cond_4

    iget-boolean v1, p0, Le/h/b/a/m/d;->l:Z

    iget-boolean v3, p1, Le/h/b/a/m/d;->l:Z

    if-ne v1, v3, :cond_4

    iget-boolean v1, p0, Le/h/b/a/m/d;->p:Z

    iget-boolean v3, p1, Le/h/b/a/m/d;->p:Z

    if-ne v1, v3, :cond_4

    iget-boolean v1, p0, Le/h/b/a/m/d;->m:Z

    iget-boolean v3, p1, Le/h/b/a/m/d;->m:Z

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->d:Ljava/lang/String;

    iget-object v3, p1, Le/h/b/a/m/d;->d:Ljava/lang/String;

    .line 6
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->e:Lfr/mbs/binary/Octets;

    iget-object v3, p1, Le/h/b/a/m/d;->e:Lfr/mbs/binary/Octets;

    .line 7
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->g:Ljava/lang/String;

    iget-object v3, p1, Le/h/b/a/m/d;->g:Ljava/lang/String;

    .line 8
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    iget-object v3, p1, Le/h/b/a/m/d;->h:Ljava/lang/String;

    .line 9
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    iget-object v3, p1, Le/h/b/a/m/d;->c:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 10
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->k:Lfr/mbs/binary/Octets;

    iget-object v3, p1, Le/h/b/a/m/d;->k:Lfr/mbs/binary/Octets;

    .line 11
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    iget-object v3, p1, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Le/h/b/a/m/d;->o:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    iget-object p1, p1, Le/h/b/a/m/d;->o:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    if-ne v1, p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->r:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Le/h/b/a/m/d;->d:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Le/h/b/a/m/d;->e:Lfr/mbs/binary/Octets;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-boolean v1, p0, Le/h/b/a/m/d;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Le/h/b/a/m/d;->g:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Le/h/b/a/m/d;->h:Ljava/lang/String;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-boolean v1, p0, Le/h/b/a/m/d;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Le/h/b/a/m/d;->k:Lfr/mbs/binary/Octets;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-boolean v1, p0, Le/h/b/a/m/d;->l:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-boolean v1, p0, Le/h/b/a/m/d;->m:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget-object v1, p0, Le/h/b/a/m/d;->o:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    iget-boolean v1, p0, Le/h/b/a/m/d;->p:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->t:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->z:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-object v0
.end method

.method public final l()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/h/b/a/m/d;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f05001f

    goto :goto_0

    :cond_0
    const v0, 0x7f050089

    :goto_0
    return v0
.end method

.method public final m()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->l:Z

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Le/h/b/a/m/d;->f:Z

    if-eqz v0, :cond_0

    const v0, 0x7f0e0147

    goto :goto_0

    :cond_0
    const v0, 0x7f0e0149

    :goto_0
    return v0

    .line 3
    :cond_1
    sget-object v0, Le/h/b/a/m/b;->a:[I

    iget-object v1, p0, Le/h/b/a/m/d;->n:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const v0, 0x7f0e0165

    return v0

    :cond_2
    const v0, 0x7f0e003c

    return v0

    :cond_3
    const v0, 0x7f0e003f

    return v0

    :cond_4
    const v0, 0x7f0e0040

    return v0
.end method

.method public n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->v:Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->i:Le/h/b/a/p/i;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/h/b/a/p/i;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v0

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()Le/h/b/a/m/i;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->s:Le/h/b/a/m/i;

    return-object v0
.end method

.method public q()Le/h/b/a/m/a;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->y:Le/h/b/a/m/a;

    return-object v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->x:Z

    return v0
.end method

.method public s()Z
    .locals 2

    const-string v0, "caf\u00e9"

    .line 1
    invoke-virtual {p0, v0}, Le/h/b/a/m/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "coffee"

    invoke-virtual {p0, v0}, Le/h/b/a/m/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v0

    sget-object v1, Le/h/b/a/m/d;->C:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->m:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->u:Z

    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->w:Z

    return v0
.end method

.method public w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->A:Z

    return v0
.end method

.method public x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->B:Z

    return v0
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->p:Z

    return v0
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/b/a/m/d;->q:Z

    return v0
.end method
