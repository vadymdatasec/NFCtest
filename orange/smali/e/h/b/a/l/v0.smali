.class public Le/h/b/a/l/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    .line 3
    new-instance v0, Le/h/b/a/l/c;

    invoke-direct {v0, p1}, Le/h/b/a/l/c;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    return-void
.end method

.method public static synthetic a(Le/h/b/a/l/v0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/b/a/l/v0;->a(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;I)Landroid/view/View;
    .locals 5

    .line 6
    new-instance v0, Landroidx/cardview/widget/CardView;

    iget-object v1, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V

    .line 7
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v1, 0x41c80000    # 25.0f

    .line 8
    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    .line 9
    new-instance v1, Landroid/widget/TextView;

    iget-object v4, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/16 v4, 0x11

    .line 10
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 11
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p1, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 p1, 0xf

    .line 13
    invoke-virtual {p0, p1}, Le/h/b/a/l/v0;->b(I)I

    move-result v2

    const/16 v3, 0xa

    invoke-virtual {p0, v3}, Le/h/b/a/l/v0;->b(I)I

    move-result v4

    invoke-virtual {p0, p1}, Le/h/b/a/l/v0;->b(I)I

    move-result p1

    invoke-virtual {p0, v3}, Le/h/b/a/l/v0;->b(I)I

    move-result v3

    invoke-virtual {v1, v2, v4, p1, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    const-string p1, "#FFFFFF"

    .line 14
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, p1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 16
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    .line 20
    iget-object v0, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 21
    iget-object v0, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public final a(Le/h/b/a/m/d;)V
    .locals 3

    .line 18
    new-instance p1, Le/h/b/a/l/u0;

    invoke-direct {p1, p0}, Le/h/b/a/l/u0;-><init>(Le/h/b/a/l/v0;)V

    .line 19
    iget-object v0, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(Ljava/lang/String;ILe/h/b/a/m/d;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Le/h/b/a/l/v0;->a(I)V

    .line 4
    iget-object v0, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/v0;->a(Ljava/lang/String;I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 5
    invoke-virtual {p0, p3}, Le/h/b/a/l/v0;->a(Le/h/b/a/m/d;)V

    return-void
.end method

.method public final b(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/l/v0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method
