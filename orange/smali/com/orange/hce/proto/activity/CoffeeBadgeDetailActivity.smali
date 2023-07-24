.class public Lcom/orange/hce/proto/activity/CoffeeBadgeDetailActivity;
.super Le/h/b/a/l/d1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/b/a/l/d1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;IILcom/orange/oab/contactless/packid/domain/Transaction;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 3
    invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getAmountInCents()Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/CoffeeBadgeDetailActivity;->e(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getAmountInCents()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    const v0, 0x7f05001f

    goto :goto_0

    :cond_0
    const v0, 0x7f050095

    :goto_0
    invoke-static {p3, v0}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    const p2, 0x7f080186

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 6
    invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public b(Le/h/b/a/m/d;)V
    .locals 5

    const-string v0, "nfco.CoffeeBadgeAct"

    .line 1
    :try_start_0
    new-instance v1, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/orange/business/packid/android/lib/PackId;->getUserByContactlessId(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v1

    invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;

    move-result-object p1

    const v1, 0x7f080145

    .line 3
    invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0800db

    .line 4
    invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v3, 0x7f080177

    .line 5
    invoke-virtual {p0, v3}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 6
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getCurrentBalance()I

    move-result v4

    invoke-virtual {p0, v4}, Lcom/orange/hce/proto/activity/CoffeeBadgeDetailActivity;->e(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getLastTransactionType()Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    move-result-object p1

    sget-object v3, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->UNKNOWN:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    if-ne p1, v3, :cond_0

    .line 8
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 9
    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "Unknown application data"

    .line 10
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    const-string p1, "No user available while trying to update badges view"

    .line 11
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_2
    move-exception p1

    const-string v1, "Error on finding token (nothing to scare)"

    .line 12
    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public e(I)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {}, Ljava/text/NumberFormat;->getCurrencyInstance()Ljava/text/NumberFormat;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0082

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setCurrency(Ljava/util/Currency;)V

    int-to-double v1, p1

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double/2addr v1, v3

    .line 3
    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public s()I
    .locals 1

    const v0, 0x7f0b001e

    return v0
.end method

.method public t()I
    .locals 1

    const v0, 0x7f0b006c

    return v0
.end method
