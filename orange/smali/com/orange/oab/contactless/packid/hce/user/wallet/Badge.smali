.class public Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;
    }
.end annotation


# static fields
.field public static final B:Lfr/mbs/binary/Octets;

.field public static final DEFAULT_SECURED_ZONE_ID:Lfr/mbs/binary/Octets;


# instance fields
.field public A:Le/h/d/a/a/l;

.field public b:Lfr/mbs/binary/Octets;

.field public c:Ljava/lang/String;

.field public d:Lfr/mbs/binary/Octets;

.field public e:Lfr/mbs/binary/Octets;

.field public f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

.field public g:Ljava/lang/String;

.field public h:Lfr/mbs/binary/Octets;

.field public i:Lfr/mbs/binary/Octets;

.field public j:Ljava/lang/String;

.field public k:B

.field public l:B

.field public m:Ljava/util/Date;

.field public n:Z

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/Integer;

.field public q:Ljava/lang/Integer;

.field public r:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public s:Z

.field public t:Lfr/mbs/binary/Octets;

.field public u:Ljava/lang/Integer;

.field public v:Ljava/lang/Integer;

.field public w:Z

.field public x:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

.field public y:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0F0F0F0F0F0F"

    .line 1
    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    sput-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->DEFAULT_SECURED_ZONE_ID:Lfr/mbs/binary/Octets;

    const-string v0, "11223344556677889900AABBCCDDEEFF"

    .line 2
    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    sput-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->B:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 19
    sget-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->x:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 20
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->y:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    .line 21
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    .line 22
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    .line 23
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    .line 24
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->i:Lfr/mbs/binary/Octets;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->i:Lfr/mbs/binary/Octets;

    .line 25
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    .line 26
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->h:Lfr/mbs/binary/Octets;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->h:Lfr/mbs/binary/Octets;

    .line 27
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->c:Ljava/lang/String;

    .line 28
    iget-object p1, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->o:Ljava/lang/String;

    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->o:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 12
    sget-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->x:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 13
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->y:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    .line 14
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    .line 15
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    .line 16
    iput-object p3, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 3
    sget-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->x:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 4
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->y:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    .line 5
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    .line 6
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    .line 7
    iput-object p3, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->c:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    .line 9
    iput-object p5, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 31
    sget-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->x:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 32
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->y:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    .line 33
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    .line 34
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->c:Ljava/lang/String;

    .line 35
    iput-object p3, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "android_id"

    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->a(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/h/d/a/a/n/w/c;)Lfr/mbs/binary/Octets;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 4
    new-instance v0, Le/h/d/a/a/o/b/a;

    invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->B:Lfr/mbs/binary/Octets;

    sget-object v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->DEFAULT_WALLET_ID:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1, v2}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lfr/mbs/binary/Octets;Le/h/d/a/a/n/w/c;)Lfr/mbs/binary/Octets;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 6
    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p1, p0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p0

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->cycleTosize(I)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static a()Ljava/util/Date;
    .locals 3

    .line 7
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 8
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x1

    const/16 v2, 0xa

    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 10
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0xa

    invoke-static {p0}, Lfr/mbs/binary/Octets;->random(I)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "[^0123456789abcdefABCDEF]"

    const-string v1, ""

    .line 1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static defaultSecuredBadge(Landroid/content/Context;Le/h/d/a/a/n/w/c;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->a(Landroid/content/Context;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    sget-object v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->DEFAULT_SECURED_ZONE_ID:Lfr/mbs/binary/Octets;

    invoke-static {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->a(Lfr/mbs/binary/Octets;Le/h/d/a/a/n/w/c;)Lfr/mbs/binary/Octets;

    move-result-object v3

    sget v4, Le/h/d/a/a/c;->default_zone_secured_description:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, v2, v3, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->a()Ljava/util/Date;

    move-result-object p0

    iput-object p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->m:Ljava/util/Date;

    .line 4
    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->c:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->a(Le/h/d/a/a/n/w/c;)Lfr/mbs/binary/Octets;

    move-result-object p0

    iput-object p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    const/16 p0, -0x2d

    .line 6
    iput-byte p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->k:B

    const/4 p0, 0x2

    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->q:Ljava/lang/Integer;

    const/16 p0, 0xa

    .line 8
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->p:Ljava/lang/Integer;

    const/16 p0, -0x14

    .line 9
    iput-byte p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->l:B

    const/4 p0, 0x1

    .line 10
    iput-boolean p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->z:Z

    .line 11
    sget-object p0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_AND_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    iput-object p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-object v1
.end method

.method public static mask(Lfr/mbs/binary/Octets;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "XXXXXXXXXXXX"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {p0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_b

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    if-eq v3, v2, :cond_1

    goto :goto_4

    .line 2
    :cond_1
    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 3
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {v2, v3}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 4
    :cond_3
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 5
    :cond_5
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_6

    iget-object v3, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    invoke-virtual {v2, v3}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_6
    iget-object v2, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_7

    :goto_2
    return v1

    .line 6
    :cond_7
    iget-boolean v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z

    iget-boolean v3, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z

    if-eq v2, v3, :cond_8

    return v1

    .line 7
    :cond_8
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    iget-object p1, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_9

    invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_3

    :cond_9
    if-nez p1, :cond_a

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    :goto_3
    return v0

    :cond_b
    :goto_4
    return v1
.end method

.method public getBleSessionTimeout()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->p:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCipheredId()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->h:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getCipheredUrl()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->i:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getCipheredWalletKey()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->y:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    return-object v0
.end method

.method public getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-object v0
.end method

.method public getContactlessTypeInformation()Le/h/d/a/a/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->A:Le/h/d/a/a/l;

    return-object v0
.end method

.method public getContactlessTypePersonalisedDown()Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->A:Le/h/d/a/a/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/h/d/a/a/l;->a()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContactlessTypePersonalisedUp()Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->A:Le/h/d/a/a/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/h/d/a/a/l;->b()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContactlessTypePersonalisedVersion()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->A:Le/h/d/a/a/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/h/d/a/a/l;->c()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getDelayAfterBadgeOk()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->q:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDelayAfterBadgeOkMs()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->q:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getGattConnectionTimeoutMs()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->p:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x1e

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    :goto_0
    mul-int/lit16 v0, v0, 0x3e8

    return v0
.end method

.method public getLogoFile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getMaskedId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getRegenerationDate()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->m:Ljava/util/Date;

    return-object v0
.end method

.method public getRssi()B
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->k:B

    return v0
.end method

.method public getRssiButtonInterval()B
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->l:B

    return v0
.end method

.method public getRssiDurationForButtonComputation()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->v:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStatus()Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->x:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    return-object v0
.end method

.method public getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    return-object v0
.end method

.method public getUnlockableByZoneID()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->t:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getUnlockedDuration()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->u:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getZoneId()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public isActive()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I

    move-result v0

    if-lez v0, :cond_0

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

.method public isBle()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isConditionToBeginTransactionReached(Landroid/content/Context;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->unlockPhoneRequired:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Le/h/d/a/a/n/s;->c(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    .line 2
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isDefault(Landroid/content/Context;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->DEFAULT_SECURED_ZONE_ID:Lfr/mbs/binary/Octets;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object p1

    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Le/h/d/a/a/s/g0;->b(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isLockable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z

    return v0
.end method

.method public isLocked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->w:Z

    return v0
.end method

.method public isManualConnectionAllowed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->z:Z

    return v0
.end method

.method public isNfcOnly()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSecured()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->d:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isToken()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->i:Lfr/mbs/binary/Octets;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

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

.method public isTransactionAllowed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->n:Z

    return v0
.end method

.method public setBleSessionTimeout(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->p:Ljava/lang/Integer;

    return-void
.end method

.method public setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->h:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public setCipheredUrl(Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->i:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public setConditionToBeginTransaction(Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->y:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    return-void
.end method

.method public setContactlessType(Lcom/orange/oab/contactless/packid/ContactlessType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->r:Lcom/orange/oab/contactless/packid/ContactlessType;

    return-void
.end method

.method public setContactlessTypeInformation(Le/h/d/a/a/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->A:Le/h/d/a/a/l;

    return-void
.end method

.method public setDelayAfterBadgeOk(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->q:Ljava/lang/Integer;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    return-void
.end method

.method public setLockable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z

    return-void
.end method

.method public setLocked(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->w:Z

    return-void
.end method

.method public setLogoFile(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->j:Ljava/lang/String;

    return-void
.end method

.method public setManualConnectionAllowed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->z:Z

    return-void
.end method

.method public setRegenerationDate(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->m:Ljava/util/Date;

    return-void
.end method

.method public setRssi(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->k:B

    return-void
.end method

.method public setRssiButtonInterval(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->l:B

    return-void
.end method

.method public setRssiDurationForButtonComputation(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->v:Ljava/lang/Integer;

    return-void
.end method

.method public setStatus(Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->x:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    return-void
.end method

.method public setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    return-void
.end method

.method public setTransactionAllowed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->n:Z

    return-void
.end method

.method public setUnlockableByZoneID(Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->t:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public setUnlockedDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->u:Ljava/lang/Integer;

    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->o:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Le/f/b/a/j;->a(Ljava/lang/Object;)Le/f/b/a/j$a;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->e:Lfr/mbs/binary/Octets;

    const-string v2, "accessId"

    .line 2
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->b:Lfr/mbs/binary/Octets;

    const-string v2, "cipheredId"

    .line 3
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    .line 4
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result v1

    const-string v2, "isSecured"

    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Z)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->f:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    const-string v2, "tokenData"

    .line 5
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->g:Ljava/lang/String;

    const-string v2, "description"

    .line 6
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->m:Ljava/util/Date;

    const-string v2, "regenerationDate"

    .line 7
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    .line 8
    invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updateToken(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->a:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V

    .line 2
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V

    .line 3
    iget-object v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->d:Ljava/util/Date;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V

    .line 4
    :cond_0
    iget-object p1, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->c:Lfr/mbs/binary/Octets;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V

    :cond_1
    return-void
.end method
