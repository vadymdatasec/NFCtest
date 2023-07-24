.class public Lcom/orange/hce/proto/activity/AccessBadgeDetailActivity;
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
    .locals 0

    const/4 p3, 0x0

    .line 1
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b(Le/h/b/a/m/d;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Le/h/b/a/m/d;->B()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f080145

    .line 2
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public s()I
    .locals 1

    const v0, 0x7f0b001c

    return v0
.end method

.method public t()I
    .locals 1

    const v0, 0x7f0b006b

    return v0
.end method
