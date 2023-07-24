.class public Le/h/b/a/l/z0;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Ljava/util/Date;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const v0, 0x7f0b003e

    .line 2
    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    iput-object p2, p0, Le/h/b/a/l/z0;->b:Ljava/lang/String;

    const p1, 0x7f08017e

    .line 4
    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V

    .line 5
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/z0;->c:Ljava/util/Date;

    .line 6
    invoke-virtual {p0}, Le/h/b/a/l/z0;->a()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 10
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Le/h/b/a/l/z0;->c:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    .line 11
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const v0, 0x7f0e00c5

    invoke-virtual {v2, v0, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f080180

    .line 12
    invoke-virtual {p0, v1, v0}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V

    return-void
.end method

.method public final a(I)V
    .locals 1

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    const/16 v0, 0x8

    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 1

    .line 2
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f080183

    invoke-virtual {p0, v0, p1}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V

    .line 3
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/z0;->c:Ljava/util/Date;

    .line 4
    invoke-virtual {p0}, Le/h/b/a/l/z0;->a()V

    const p1, 0x7f080184

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {p0, p1, p2}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Le/h/b/a/l/z0;->a(I)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/l/z0;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
