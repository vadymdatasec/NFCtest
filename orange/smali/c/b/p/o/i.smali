.class public final Lc/b/p/o/i;
.super Lc/b/p/o/w;
.source "SourceFile"

# interfaces
.implements Lc/b/p/o/z;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# static fields
.field public static final C:I


# instance fields
.field public A:Landroid/widget/PopupWindow$OnDismissListener;

.field public B:Z

.field public final c:Landroid/content/Context;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Landroid/os/Handler;

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/b/p/o/m;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/b/p/o/h;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final l:Landroid/view/View$OnAttachStateChangeListener;

.field public final m:Lc/b/q/q1;

.field public n:I

.field public o:I

.field public p:Landroid/view/View;

.field public q:Landroid/view/View;

.field public r:I

.field public s:Z

.field public t:Z

.field public u:I

.field public v:I

.field public w:Z

.field public x:Z

.field public y:Lc/b/p/o/z$a;

.field public z:Landroid/view/ViewTreeObserver;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lc/b/g;->abc_cascading_menu_item_layout:I

    sput v0, Lc/b/p/o/i;->C:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/b/p/o/w;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/b/p/o/i;->i:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    .line 4
    new-instance v0, Lc/b/p/o/d;

    invoke-direct {v0, p0}, Lc/b/p/o/d;-><init>(Lc/b/p/o/i;)V

    iput-object v0, p0, Lc/b/p/o/i;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 5
    new-instance v0, Lc/b/p/o/e;

    invoke-direct {v0, p0}, Lc/b/p/o/e;-><init>(Lc/b/p/o/i;)V

    iput-object v0, p0, Lc/b/p/o/i;->l:Landroid/view/View$OnAttachStateChangeListener;

    .line 6
    new-instance v0, Lc/b/p/o/g;

    invoke-direct {v0, p0}, Lc/b/p/o/g;-><init>(Lc/b/p/o/i;)V

    iput-object v0, p0, Lc/b/p/o/i;->m:Lc/b/q/q1;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lc/b/p/o/i;->n:I

    .line 8
    iput v0, p0, Lc/b/p/o/i;->o:I

    .line 9
    iput-object p1, p0, Lc/b/p/o/i;->c:Landroid/content/Context;

    .line 10
    iput-object p2, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    .line 11
    iput p3, p0, Lc/b/p/o/i;->e:I

    .line 12
    iput p4, p0, Lc/b/p/o/i;->f:I

    .line 13
    iput-boolean p5, p0, Lc/b/p/o/i;->g:Z

    .line 14
    iput-boolean v0, p0, Lc/b/p/o/i;->w:Z

    .line 15
    invoke-virtual {p0}, Lc/b/p/o/i;->h()I

    move-result p2

    iput p2, p0, Lc/b/p/o/i;->r:I

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p2, p2, 0x2

    sget p3, Lc/b/d;->abc_config_prefDialogWidth:I

    .line 18
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 19
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lc/b/p/o/i;->d:I

    .line 20
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lc/b/p/o/i;->h:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Lc/b/p/o/m;Lc/b/p/o/m;)Landroid/view/MenuItem;
    .locals 4

    .line 14
    invoke-virtual {p1}, Lc/b/p/o/m;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    invoke-virtual {p1, v1}, Lc/b/p/o/m;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 16
    invoke-interface {v2}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v3

    if-ne p2, v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Lc/b/p/o/h;Lc/b/p/o/m;)Landroid/view/View;
    .locals 7

    .line 17
    iget-object v0, p1, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    invoke-virtual {p0, v0, p2}, Lc/b/p/o/i;->a(Lc/b/p/o/m;Lc/b/p/o/m;)Landroid/view/MenuItem;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lc/b/p/o/h;->a()Landroid/widget/ListView;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 20
    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 21
    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    .line 22
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v2

    .line 23
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    check-cast v1, Lc/b/p/o/l;

    goto :goto_0

    .line 24
    :cond_1
    check-cast v1, Lc/b/p/o/l;

    const/4 v2, 0x0

    .line 25
    :goto_0
    invoke-virtual {v1}, Lc/b/p/o/l;->getCount()I

    move-result v4

    :goto_1
    const/4 v5, -0x1

    if-ge v3, v4, :cond_3

    .line 26
    invoke-virtual {v1, v3}, Lc/b/p/o/l;->getItem(I)Lc/b/p/o/p;

    move-result-object v6

    if-ne p2, v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, -0x1

    :goto_2
    if-ne v3, v5, :cond_4

    return-object v0

    :cond_4
    add-int/2addr v3, v2

    .line 27
    invoke-virtual {p1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result p2

    sub-int/2addr v3, p2

    if-ltz v3, :cond_6

    .line 28
    invoke-virtual {p1}, Landroid/widget/ListView;->getChildCount()I

    move-result p2

    if-lt v3, p2, :cond_5

    goto :goto_3

    .line 29
    :cond_5
    invoke-virtual {p1, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_3
    return-object v0
.end method

.method public a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/b/p/o/i;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/b/p/o/i;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/p/o/m;

    .line 3
    invoke-virtual {p0, v1}, Lc/b/p/o/i;->d(Lc/b/p/o/m;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lc/b/p/o/i;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 5
    iget-object v0, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    iput-object v0, p0, Lc/b/p/o/i;->q:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 6
    iget-object v0, p0, Lc/b/p/o/i;->z:Landroid/view/ViewTreeObserver;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 7
    :goto_1
    iget-object v1, p0, Lc/b/p/o/i;->q:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, p0, Lc/b/p/o/i;->z:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lc/b/p/o/i;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 9
    :cond_3
    iget-object v0, p0, Lc/b/p/o/i;->q:Landroid/view/View;

    iget-object v1, p0, Lc/b/p/o/i;->l:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_4
    return-void
.end method

.method public a(I)V
    .locals 1

    .line 64
    iget v0, p0, Lc/b/p/o/i;->n:I

    if-eq v0, p1, :cond_0

    .line 65
    iput p1, p0, Lc/b/p/o/i;->n:I

    .line 66
    iget-object v0, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    .line 67
    invoke-static {v0}, Lc/h/n/v0;->o(Landroid/view/View;)I

    move-result v0

    .line 68
    invoke-static {p1, v0}, Lc/h/n/i;->a(II)I

    move-result p1

    iput p1, p0, Lc/b/p/o/i;->o:I

    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .line 69
    iget-object v0, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    if-eq v0, p1, :cond_0

    .line 70
    iput-object p1, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    .line 71
    iget v0, p0, Lc/b/p/o/i;->n:I

    .line 72
    invoke-static {p1}, Lc/h/n/v0;->o(Landroid/view/View;)I

    move-result p1

    .line 73
    invoke-static {v0, p1}, Lc/h/n/i;->a(II)I

    move-result p1

    iput p1, p0, Lc/b/p/o/i;->o:I

    :cond_0
    return-void
.end method

.method public a(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lc/b/p/o/i;->A:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public a(Lc/b/p/o/m;)V
    .locals 1

    .line 10
    iget-object v0, p0, Lc/b/p/o/i;->c:Landroid/content/Context;

    invoke-virtual {p1, p0, v0}, Lc/b/p/o/m;->a(Lc/b/p/o/z;Landroid/content/Context;)V

    .line 11
    invoke-virtual {p0}, Lc/b/p/o/i;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    invoke-virtual {p0, p1}, Lc/b/p/o/i;->d(Lc/b/p/o/m;)V

    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lc/b/p/o/i;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public a(Lc/b/p/o/m;Z)V
    .locals 5

    .line 40
    invoke-virtual {p0, p1}, Lc/b/p/o/i;->c(Lc/b/p/o/m;)I

    move-result v0

    if-gez v0, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 41
    iget-object v2, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_1

    .line 42
    iget-object v2, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/p/o/h;

    .line 43
    iget-object v1, v1, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    invoke-virtual {v1, v3}, Lc/b/p/o/m;->a(Z)V

    .line 44
    :cond_1
    iget-object v1, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/p/o/h;

    .line 45
    iget-object v1, v0, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    invoke-virtual {v1, p0}, Lc/b/p/o/m;->b(Lc/b/p/o/z;)V

    .line 46
    iget-boolean v1, p0, Lc/b/p/o/i;->B:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 47
    iget-object v1, v0, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v1, v2}, Lc/b/q/s1;->b(Ljava/lang/Object;)V

    .line 48
    iget-object v1, v0, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v1, v3}, Lc/b/q/p1;->d(I)V

    .line 49
    :cond_2
    iget-object v0, v0, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v0}, Lc/b/q/p1;->dismiss()V

    .line 50
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 51
    iget-object v1, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/p/o/h;

    iget v1, v1, Lc/b/p/o/h;->c:I

    iput v1, p0, Lc/b/p/o/i;->r:I

    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {p0}, Lc/b/p/o/i;->h()I

    move-result v1

    iput v1, p0, Lc/b/p/o/i;->r:I

    :goto_0
    if-nez v0, :cond_7

    .line 53
    invoke-virtual {p0}, Lc/b/p/o/i;->dismiss()V

    .line 54
    iget-object p2, p0, Lc/b/p/o/i;->y:Lc/b/p/o/z$a;

    if-eqz p2, :cond_4

    const/4 v0, 0x1

    .line 55
    invoke-interface {p2, p1, v0}, Lc/b/p/o/z$a;->a(Lc/b/p/o/m;Z)V

    .line 56
    :cond_4
    iget-object p1, p0, Lc/b/p/o/i;->z:Landroid/view/ViewTreeObserver;

    if-eqz p1, :cond_6

    .line 57
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 58
    iget-object p1, p0, Lc/b/p/o/i;->z:Landroid/view/ViewTreeObserver;

    iget-object p2, p0, Lc/b/p/o/i;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 59
    :cond_5
    iput-object v2, p0, Lc/b/p/o/i;->z:Landroid/view/ViewTreeObserver;

    .line 60
    :cond_6
    iget-object p1, p0, Lc/b/p/o/i;->q:Landroid/view/View;

    iget-object p2, p0, Lc/b/p/o/i;->l:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 61
    iget-object p1, p0, Lc/b/p/o/i;->A:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    goto :goto_1

    :cond_7
    if-eqz p2, :cond_8

    .line 62
    iget-object p1, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/b/p/o/h;

    .line 63
    iget-object p1, p1, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    invoke-virtual {p1, v3}, Lc/b/p/o/m;->a(Z)V

    :cond_8
    :goto_1
    return-void
.end method

.method public a(Lc/b/p/o/z$a;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lc/b/p/o/i;->y:Lc/b/p/o/z$a;

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 30
    iget-object p1, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/p/o/h;

    .line 31
    invoke-virtual {v0}, Lc/b/p/o/h;->a()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-static {v0}, Lc/b/p/o/w;->a(Landroid/widget/ListAdapter;)Lc/b/p/o/l;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/p/o/l;->notifyDataSetChanged()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lc/b/p/o/g0;)Z
    .locals 4

    .line 33
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/p/o/h;

    .line 34
    iget-object v3, v1, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    if-ne p1, v3, :cond_0

    .line 35
    invoke-virtual {v1}, Lc/b/p/o/h;->a()Landroid/widget/ListView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ListView;->requestFocus()Z

    return v2

    .line 36
    :cond_1
    invoke-virtual {p1}, Lc/b/p/o/m;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 37
    invoke-virtual {p0, p1}, Lc/b/p/o/i;->a(Lc/b/p/o/m;)V

    .line 38
    iget-object v0, p0, Lc/b/p/o/i;->y:Lc/b/p/o/z$a;

    if-eqz v0, :cond_2

    .line 39
    invoke-interface {v0, p1}, Lc/b/p/o/z$a;->a(Lc/b/p/o/m;)Z

    :cond_2
    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public b(I)V
    .locals 1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/b/p/o/i;->s:Z

    .line 4
    iput p1, p0, Lc/b/p/o/i;->u:I

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/b/p/o/i;->w:Z

    return-void
.end method

.method public b()Z
    .locals 2

    .line 2
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/p/o/h;

    iget-object v0, v0, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v0}, Lc/b/q/p1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final c(Lc/b/p/o/m;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/b/p/o/h;

    .line 3
    iget-object v2, v2, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    if-ne p1, v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public c(I)V
    .locals 1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lc/b/p/o/i;->t:Z

    .line 5
    iput p1, p0, Lc/b/p/o/i;->v:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 6
    iput-boolean p1, p0, Lc/b/p/o/i;->x:Z

    return-void
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/p/o/h;

    invoke-virtual {v0}, Lc/b/p/o/h;->a()Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->getLocationOnScreen([I)V

    .line 3
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 4
    iget-object v4, p0, Lc/b/p/o/i;->q:Landroid/view/View;

    invoke-virtual {v4, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 5
    iget v4, p0, Lc/b/p/o/i;->r:I

    const/4 v5, 0x0

    if-ne v4, v2, :cond_1

    .line 6
    aget v1, v1, v5

    invoke-virtual {v0}, Landroid/widget/ListView;->getWidth()I

    move-result v0

    add-int/2addr v1, v0

    add-int/2addr v1, p1

    .line 7
    iget p1, v3, Landroid/graphics/Rect;->right:I

    if-le v1, p1, :cond_0

    return v5

    :cond_0
    return v2

    .line 8
    :cond_1
    aget v0, v1, v5

    sub-int/2addr v0, p1

    if-gez v0, :cond_2

    return v2

    :cond_2
    return v5
.end method

.method public final d(Lc/b/p/o/m;)V
    .locals 14

    .line 9
    iget-object v0, p0, Lc/b/p/o/i;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 10
    new-instance v1, Lc/b/p/o/l;

    iget-boolean v2, p0, Lc/b/p/o/i;->g:Z

    sget v3, Lc/b/p/o/i;->C:I

    invoke-direct {v1, p1, v0, v2, v3}, Lc/b/p/o/l;-><init>(Lc/b/p/o/m;Landroid/view/LayoutInflater;ZI)V

    .line 11
    invoke-virtual {p0}, Lc/b/p/o/i;->b()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lc/b/p/o/i;->w:Z

    if-eqz v2, :cond_0

    .line 12
    invoke-virtual {v1, v3}, Lc/b/p/o/l;->a(Z)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lc/b/p/o/i;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 14
    invoke-static {p1}, Lc/b/p/o/w;->b(Lc/b/p/o/m;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lc/b/p/o/l;->a(Z)V

    .line 15
    :cond_1
    :goto_0
    iget-object v2, p0, Lc/b/p/o/i;->c:Landroid/content/Context;

    iget v4, p0, Lc/b/p/o/i;->d:I

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v4}, Lc/b/p/o/w;->a(Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I

    move-result v2

    .line 16
    invoke-virtual {p0}, Lc/b/p/o/i;->f()Lc/b/q/s1;

    move-result-object v4

    .line 17
    invoke-virtual {v4, v1}, Lc/b/q/p1;->a(Landroid/widget/ListAdapter;)V

    .line 18
    invoke-virtual {v4, v2}, Lc/b/q/p1;->e(I)V

    .line 19
    iget v1, p0, Lc/b/p/o/i;->o:I

    invoke-virtual {v4, v1}, Lc/b/q/p1;->f(I)V

    .line 20
    iget-object v1, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 21
    iget-object v1, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v3

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/p/o/h;

    .line 22
    invoke-virtual {p0, v1, p1}, Lc/b/p/o/i;->a(Lc/b/p/o/h;Lc/b/p/o/m;)Landroid/view/View;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v1, v5

    move-object v6, v1

    :goto_1
    const/4 v7, 0x0

    if-eqz v6, :cond_9

    .line 23
    invoke-virtual {v4, v7}, Lc/b/q/s1;->d(Z)V

    .line 24
    invoke-virtual {v4, v5}, Lc/b/q/s1;->a(Ljava/lang/Object;)V

    .line 25
    invoke-virtual {p0, v2}, Lc/b/p/o/i;->d(I)I

    move-result v8

    if-ne v8, v3, :cond_3

    const/4 v9, 0x1

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    .line 26
    :goto_2
    iput v8, p0, Lc/b/p/o/i;->r:I

    .line 27
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1a

    const/4 v11, 0x5

    if-lt v8, v10, :cond_4

    .line 28
    invoke-virtual {v4, v6}, Lc/b/q/p1;->a(Landroid/view/View;)V

    const/4 v8, 0x0

    const/4 v12, 0x0

    goto :goto_3

    :cond_4
    const/4 v8, 0x2

    new-array v10, v8, [I

    .line 29
    iget-object v12, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    invoke-virtual {v12, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    new-array v8, v8, [I

    .line 30
    invoke-virtual {v6, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 31
    iget v12, p0, Lc/b/p/o/i;->o:I

    and-int/lit8 v12, v12, 0x7

    if-ne v12, v11, :cond_5

    .line 32
    aget v12, v10, v7

    iget-object v13, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    move-result v13

    add-int/2addr v12, v13

    aput v12, v10, v7

    .line 33
    aget v12, v8, v7

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v13

    add-int/2addr v12, v13

    aput v12, v8, v7

    .line 34
    :cond_5
    aget v12, v8, v7

    aget v13, v10, v7

    sub-int/2addr v12, v13

    .line 35
    aget v8, v8, v3

    aget v10, v10, v3

    sub-int/2addr v8, v10

    .line 36
    :goto_3
    iget v10, p0, Lc/b/p/o/i;->o:I

    and-int/2addr v10, v11

    if-ne v10, v11, :cond_7

    if-eqz v9, :cond_6

    goto :goto_4

    .line 37
    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v2

    goto :goto_5

    :cond_7
    if-eqz v9, :cond_8

    .line 38
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v2

    :goto_4
    add-int/2addr v12, v2

    goto :goto_6

    :cond_8
    :goto_5
    sub-int/2addr v12, v2

    .line 39
    :goto_6
    invoke-virtual {v4, v12}, Lc/b/q/p1;->a(I)V

    .line 40
    invoke-virtual {v4, v3}, Lc/b/q/p1;->b(Z)V

    .line 41
    invoke-virtual {v4, v8}, Lc/b/q/p1;->b(I)V

    goto :goto_7

    .line 42
    :cond_9
    iget-boolean v2, p0, Lc/b/p/o/i;->s:Z

    if-eqz v2, :cond_a

    .line 43
    iget v2, p0, Lc/b/p/o/i;->u:I

    invoke-virtual {v4, v2}, Lc/b/q/p1;->a(I)V

    .line 44
    :cond_a
    iget-boolean v2, p0, Lc/b/p/o/i;->t:Z

    if-eqz v2, :cond_b

    .line 45
    iget v2, p0, Lc/b/p/o/i;->v:I

    invoke-virtual {v4, v2}, Lc/b/q/p1;->b(I)V

    .line 46
    :cond_b
    invoke-virtual {p0}, Lc/b/p/o/w;->e()Landroid/graphics/Rect;

    move-result-object v2

    .line 47
    invoke-virtual {v4, v2}, Lc/b/q/p1;->a(Landroid/graphics/Rect;)V

    .line 48
    :goto_7
    new-instance v2, Lc/b/p/o/h;

    iget v3, p0, Lc/b/p/o/i;->r:I

    invoke-direct {v2, v4, p1, v3}, Lc/b/p/o/h;-><init>(Lc/b/q/s1;Lc/b/p/o/m;I)V

    .line 49
    iget-object v3, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-virtual {v4}, Lc/b/q/p1;->a()V

    .line 51
    invoke-virtual {v4}, Lc/b/q/p1;->g()Landroid/widget/ListView;

    move-result-object v2

    .line 52
    invoke-virtual {v2, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    if-nez v1, :cond_c

    .line 53
    iget-boolean v1, p0, Lc/b/p/o/i;->x:Z

    if-eqz v1, :cond_c

    invoke-virtual {p1}, Lc/b/p/o/m;->h()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 54
    sget v1, Lc/b/g;->abc_popup_menu_header_item_layout:I

    invoke-virtual {v0, v1, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const v1, 0x1020016

    .line 55
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 56
    invoke-virtual {v0, v7}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 57
    invoke-virtual {p1}, Lc/b/p/o/m;->h()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    invoke-virtual {v2, v0, v5, v7}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 59
    invoke-virtual {v4}, Lc/b/q/p1;->a()V

    :cond_c
    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v1, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    new-array v2, v0, [Lc/b/p/o/h;

    .line 3
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lc/b/p/o/h;

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 4
    aget-object v2, v1, v0

    .line 5
    iget-object v3, v2, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v3}, Lc/b/q/p1;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    iget-object v2, v2, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v2}, Lc/b/q/p1;->dismiss()V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final f()Lc/b/q/s1;
    .locals 5

    .line 1
    new-instance v0, Lc/b/q/s1;

    iget-object v1, p0, Lc/b/p/o/i;->c:Landroid/content/Context;

    iget v2, p0, Lc/b/p/o/i;->e:I

    iget v3, p0, Lc/b/p/o/i;->f:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lc/b/q/s1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    iget-object v1, p0, Lc/b/p/o/i;->m:Lc/b/q/q1;

    invoke-virtual {v0, v1}, Lc/b/q/s1;->a(Lc/b/q/q1;)V

    .line 3
    invoke-virtual {v0, p0}, Lc/b/q/p1;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 4
    invoke-virtual {v0, p0}, Lc/b/q/p1;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 5
    iget-object v1, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Lc/b/q/p1;->a(Landroid/view/View;)V

    .line 6
    iget v1, p0, Lc/b/p/o/i;->o:I

    invoke-virtual {v0, v1}, Lc/b/q/p1;->f(I)V

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lc/b/q/p1;->a(Z)V

    const/4 v1, 0x2

    .line 8
    invoke-virtual {v0, v1}, Lc/b/q/p1;->g(I)V

    return-object v0
.end method

.method public g()Landroid/widget/ListView;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/p/o/h;

    invoke-virtual {v0}, Lc/b/p/o/h;->a()Landroid/widget/ListView;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final h()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/p/o/i;->p:Landroid/view/View;

    invoke-static {v0}, Lc/h/n/v0;->o(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v1, 0x0

    :cond_0
    return v1
.end method

.method public onDismiss()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    iget-object v3, p0, Lc/b/p/o/i;->j:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/b/p/o/h;

    .line 3
    iget-object v4, v3, Lc/b/p/o/h;->a:Lc/b/q/s1;

    invoke-virtual {v4}, Lc/b/q/p1;->b()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    .line 4
    iget-object v0, v3, Lc/b/p/o/h;->b:Lc/b/p/o/m;

    invoke-virtual {v0, v1}, Lc/b/p/o/m;->a(Z)V

    :cond_2
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/b/p/o/i;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
