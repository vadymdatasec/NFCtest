.class public final Le/h/d/a/a/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/h/d/a/a/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/h/d/a/a/i;

    invoke-direct {v0}, Le/h/d/a/a/i;-><init>()V

    sput-object v0, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 3

    const-string v0, "context"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badge"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    invoke-virtual {v0, p1}, Le/h/d/a/a/i;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    sget-object p1, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    invoke-virtual {p1, p0}, Le/h/d/a/a/i;->b(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    invoke-virtual {p1, p0}, Le/h/d/a/a/i;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 3
    :cond_1
    sget-object v0, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    invoke-virtual {v0, p0}, Le/h/d/a/a/i;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    invoke-virtual {p0, p1}, Le/h/d/a/a/i;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public static final a(Landroid/content/Context;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badges"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 15
    invoke-static {p0, v0}, Le/h/d/a/a/i;->b(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final b(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badge"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    invoke-virtual {v0, p0}, Le/h/d/a/a/i;->b(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p1}, Le/h/d/a/a/i;->f(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final f(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 5

    const-string v0, "badge"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 1
    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_AND_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_OR_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    invoke-static {v0}, Li/f/g;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Le/h/d/a/a/i;->a:Le/h/d/a/a/i;

    invoke-virtual {v0, p0}, Le/h/d/a/a/i;->e(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 v2, 0x1

    :cond_1
    return v2
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Z
    .locals 0

    .line 8
    invoke-static {p1}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 4
    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 5
    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_AND_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 6
    invoke-static {v0}, Li/f/g;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Le/h/d/a/a/i;->d(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/ContactlessType;)Z
    .locals 2

    .line 9
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactlessTypeInformation()Le/h/d/a/a/l;

    move-result-object v0

    const-string v1, "contactlessTypeInformation = "

    invoke-static {v1, v0}, Li/h/c/k;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ContactlessCapacity"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-virtual {p0, p1}, Le/h/d/a/a/i;->c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactlessTypeInformation()Le/h/d/a/a/l;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le/h/d/a/a/l;->b()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    :goto_0
    if-ne v1, p2, :cond_3

    goto :goto_2

    .line 12
    :cond_1
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactlessTypeInformation()Le/h/d/a/a/l;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Le/h/d/a/a/l;->a()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    :goto_1
    if-ne v1, p2, :cond_3

    :goto_2
    const/4 p1, 0x1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_3
    return p1
.end method

.method public final b(Landroid/content/Context;)Z
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Le/h/d/a/a/i;->c(Landroid/content/Context;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 1

    .line 2
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_OR_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Landroid/content/Context;)Z
    .locals 0

    .line 2
    invoke-static {p1}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 1

    .line 1
    invoke-static {}, Le/h/d/a/a/t/a/a;->a()I

    move-result v0

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactlessTypeInformation()Le/h/d/a/a/l;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le/h/d/a/a/l;->c()Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-le v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final d(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->PERSONALISED:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/i;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/ContactlessType;)Z

    move-result p1

    return p1
.end method

.method public final e(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->PERSONALISED:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/i;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/ContactlessType;)Z

    move-result p1

    return p1
.end method
