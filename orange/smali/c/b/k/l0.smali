.class public final Lc/b/k/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Landroid/view/ViewGroup;

.field public h:Landroid/view/View;

.field public i:Landroid/view/View;

.field public j:Lc/b/p/o/m;

.field public k:Lc/b/p/o/k;

.field public l:Landroid/content/Context;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc/b/k/l0;->a:I

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lc/b/k/l0;->q:Z

    return-void
.end method


# virtual methods
.method public a(Lc/b/p/o/z$a;)Lc/b/p/o/a0;
    .locals 3

    .line 25
    iget-object v0, p0, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 26
    :cond_0
    iget-object v0, p0, Lc/b/k/l0;->k:Lc/b/p/o/k;

    if-nez v0, :cond_1

    .line 27
    new-instance v0, Lc/b/p/o/k;

    iget-object v1, p0, Lc/b/k/l0;->l:Landroid/content/Context;

    sget v2, Lc/b/g;->abc_list_menu_item_layout:I

    invoke-direct {v0, v1, v2}, Lc/b/p/o/k;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lc/b/k/l0;->k:Lc/b/p/o/k;

    .line 28
    invoke-virtual {v0, p1}, Lc/b/p/o/k;->a(Lc/b/p/o/z$a;)V

    .line 29
    iget-object p1, p0, Lc/b/k/l0;->j:Lc/b/p/o/m;

    iget-object v0, p0, Lc/b/k/l0;->k:Lc/b/p/o/k;

    invoke-virtual {p1, v0}, Lc/b/p/o/m;->a(Lc/b/p/o/z;)V

    .line 30
    :cond_1
    iget-object p1, p0, Lc/b/k/l0;->k:Lc/b/p/o/k;

    iget-object v0, p0, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Lc/b/p/o/k;->a(Landroid/view/ViewGroup;)Lc/b/p/o/a0;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    .line 4
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 7
    sget v2, Lc/b/a;->actionBarPopupTheme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 8
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v2, :cond_0

    .line 9
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 10
    :cond_0
    sget v2, Lc/b/a;->panelMenuListTheme:I

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 11
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v1, v0, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto :goto_0

    .line 13
    :cond_1
    sget v0, Lc/b/i;->Theme_AppCompat_CompactMenu:I

    invoke-virtual {v1, v0, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 14
    :goto_0
    new-instance v0, Lc/b/p/e;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V

    .line 15
    invoke-virtual {v0}, Lc/b/p/e;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 16
    iput-object v0, p0, Lc/b/k/l0;->l:Landroid/content/Context;

    .line 17
    sget-object p1, Lc/b/j;->AppCompatTheme:[I

    invoke-virtual {v0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 18
    sget v0, Lc/b/j;->AppCompatTheme_panelBackground:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lc/b/k/l0;->b:I

    .line 19
    sget v0, Lc/b/j;->AppCompatTheme_android_windowAnimationStyle:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lc/b/k/l0;->f:I

    .line 20
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public a(Lc/b/p/o/m;)V
    .locals 2

    .line 21
    iget-object v0, p0, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 22
    iget-object v1, p0, Lc/b/k/l0;->k:Lc/b/p/o/k;

    invoke-virtual {v0, v1}, Lc/b/p/o/m;->b(Lc/b/p/o/z;)V

    .line 23
    :cond_1
    iput-object p1, p0, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-eqz p1, :cond_2

    .line 24
    iget-object v0, p0, Lc/b/k/l0;->k:Lc/b/p/o/k;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Lc/b/p/o/m;->a(Lc/b/p/o/z;)V

    :cond_2
    return-void
.end method

.method public a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/k/l0;->h:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lc/b/k/l0;->i:Landroid/view/View;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 3
    :cond_1
    iget-object v0, p0, Lc/b/k/l0;->k:Lc/b/p/o/k;

    invoke-virtual {v0}, Lc/b/p/o/k;->a()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method
