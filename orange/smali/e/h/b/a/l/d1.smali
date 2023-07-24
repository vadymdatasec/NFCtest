.class public abstract Le/h/b/a/l/d1;
.super Le/h/b/a/l/t0;
.source "SourceFile"


# instance fields
.field public t:Landroid/widget/LinearLayout;

.field public u:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Le/h/b/a/l/t0;-><init>()V

    .line 2
    new-instance v0, Le/h/b/a/l/c1;

    invoke-direct {v0, p0}, Le/h/b/a/l/c1;-><init>(Le/h/b/a/l/d1;)V

    iput-object v0, p0, Le/h/b/a/l/d1;->u:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic a(Le/h/b/a/l/d1;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/h/b/a/l/d1;->u()V

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/view/LayoutInflater;IILcom/orange/oab/contactless/packid/domain/Transaction;)Landroid/view/View;
.end method

.method public a(Landroid/view/LayoutInflater;Lcom/orange/oab/contactless/packid/domain/Transaction;I)Landroid/view/View;
    .locals 4

    .line 6
    invoke-virtual {p0}, Le/h/b/a/l/d1;->t()I

    move-result v0

    const v1, 0x7f080187

    invoke-virtual {p0, p1, v0, v1, p2}, Le/h/b/a/l/d1;->a(Landroid/view/LayoutInflater;IILcom/orange/oab/contactless/packid/domain/Transaction;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f08017d

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0e0085

    .line 8
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    .line 9
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDate()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    rem-int/lit8 p3, p3, 0x2

    if-nez p3, :cond_0

    const p2, 0x7f0500ae

    .line 11
    invoke-static {p0, p2}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0

    :cond_0
    const p2, 0x7f05005d

    .line 12
    invoke-static {p0, p2}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_0
    return-object p1
.end method

.method public final a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/domain/Transaction;",
            ">;)V"
        }
    .end annotation

    const-string v0, "layout_inflater"

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 3
    iget-object v1, p0, Le/h/b/a/l/d1;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViewsInLayout()V

    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 5
    iget-object v2, p0, Le/h/b/a/l/d1;->t:Landroid/widget/LinearLayout;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-virtual {p0, v0, v3, v1}, Le/h/b/a/l/d1;->a(Landroid/view/LayoutInflater;Lcom/orange/oab/contactless/packid/domain/Transaction;I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract b(Le/h/b/a/m/d;)V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Le/h/b/a/l/t0;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0800d8

    .line 2
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Le/h/b/a/l/d1;->t:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onPause()V

    .line 2
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/d1;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onResume()V

    .line 2
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/d1;->u:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 3
    invoke-virtual {p0}, Le/h/b/a/l/d1;->u()V

    return-void
.end method

.method public abstract t()I
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 3
    iget-object v1, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {p0, v1}, Le/h/b/a/l/d1;->b(Le/h/b/a/m/d;)V

    .line 4
    new-instance v1, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Lcom/orange/business/packid/android/lib/PackId;->findTransactionsByZoneId(Lfr/mbs/binary/Octets;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/h/b/a/l/d1;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method
