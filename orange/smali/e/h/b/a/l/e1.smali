.class public Le/h/b/a/l/e1;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public final b:Lfr/mbs/binary/Octets;

.field public final c:Lfr/mbs/binary/Octets;

.field public final d:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;BB)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const v0, 0x7f0b006e

    .line 2
    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    iput-object p2, p0, Le/h/b/a/l/e1;->b:Lfr/mbs/binary/Octets;

    .line 4
    iput-object p3, p0, Le/h/b/a/l/e1;->c:Lfr/mbs/binary/Octets;

    const p1, 0x7f0800d7

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Le/h/b/a/l/e1;->d:Landroid/view/ViewGroup;

    const p1, 0x7f080188

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    add-int/2addr p6, p5

    const/16 p2, -0x7f

    .line 7
    invoke-static {p6, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 8
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const/4 p6, 0x3

    new-array p6, p6, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p4, p6, v0

    invoke-static {p5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p4

    const/4 p5, 0x1

    aput-object p4, p6, p5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p4, 0x2

    aput-object p2, p6, p4

    const p2, 0x7f0e0182

    invoke-virtual {p3, p2, p6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;Ljava/lang/String;)Le/h/b/a/l/z0;
    .locals 3

    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Le/h/b/a/l/z0;

    .line 8
    invoke-virtual {v1, p2}, Le/h/b/a/l/z0;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 2

    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Le/h/b/a/l/e1;->d:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 10
    iget-object v1, p0, Le/h/b/a/l/e1;->d:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Le/h/b/a/l/z0;

    .line 11
    invoke-virtual {v1}, Le/h/b/a/l/z0;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    .line 2
    iget-object v0, p0, Le/h/b/a/l/e1;->d:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0, p1}, Le/h/b/a/l/e1;->a(Landroid/view/ViewGroup;Ljava/lang/String;)Le/h/b/a/l/z0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Le/h/b/a/l/z0;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Le/h/b/a/l/z0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Le/h/b/a/l/e1;->d:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 5
    :cond_0
    invoke-virtual {v0, p2, p3}, Le/h/b/a/l/z0;->a(ILjava/lang/String;)V

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/l/e1;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/h/b/a/l/e1;->c:Lfr/mbs/binary/Octets;

    invoke-virtual {p2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
