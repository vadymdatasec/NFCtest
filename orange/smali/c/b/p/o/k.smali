.class public Lc/b/p/o/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b/p/o/z;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/view/LayoutInflater;

.field public d:Lc/b/p/o/m;

.field public e:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public f:I

.field public g:I

.field public h:I

.field public i:Lc/b/p/o/z$a;

.field public j:Lc/b/p/o/j;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lc/b/p/o/k;->h:I

    .line 6
    iput p2, p0, Lc/b/p/o/k;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p2, v0}, Lc/b/p/o/k;-><init>(II)V

    .line 2
    iput-object p1, p0, Lc/b/p/o/k;->b:Landroid/content/Context;

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lc/b/p/o/k;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public a()Landroid/widget/ListAdapter;
    .locals 1

    .line 18
    iget-object v0, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    if-nez v0, :cond_0

    .line 19
    new-instance v0, Lc/b/p/o/j;

    invoke-direct {v0, p0}, Lc/b/p/o/j;-><init>(Lc/b/p/o/k;)V

    iput-object v0, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    .line 20
    :cond_0
    iget-object v0, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    return-object v0
.end method

.method public a(Landroid/view/ViewGroup;)Lc/b/p/o/a0;
    .locals 3

    .line 11
    iget-object v0, p0, Lc/b/p/o/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v0, :cond_1

    .line 12
    iget-object v0, p0, Lc/b/p/o/k;->c:Landroid/view/LayoutInflater;

    sget v1, Lc/b/g;->abc_expanded_menu_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object p1, p0, Lc/b/p/o/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 13
    iget-object p1, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    if-nez p1, :cond_0

    .line 14
    new-instance p1, Lc/b/p/o/j;

    invoke-direct {p1, p0}, Lc/b/p/o/j;-><init>(Lc/b/p/o/k;)V

    iput-object p1, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    .line 15
    :cond_0
    iget-object p1, p0, Lc/b/p/o/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v0, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 16
    iget-object p1, p0, Lc/b/p/o/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {p1, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 17
    :cond_1
    iget-object p1, p0, Lc/b/p/o/k;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    return-object p1
.end method

.method public a(Landroid/content/Context;Lc/b/p/o/m;)V
    .locals 2

    .line 1
    iget v0, p0, Lc/b/p/o/k;->g:I

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/view/ContextThemeWrapper;

    iget v1, p0, Lc/b/p/o/k;->g:I

    invoke-direct {v0, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lc/b/p/o/k;->b:Landroid/content/Context;

    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lc/b/p/o/k;->c:Landroid/view/LayoutInflater;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lc/b/p/o/k;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 5
    iput-object p1, p0, Lc/b/p/o/k;->b:Landroid/content/Context;

    .line 6
    iget-object v0, p0, Lc/b/p/o/k;->c:Landroid/view/LayoutInflater;

    if-nez v0, :cond_1

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lc/b/p/o/k;->c:Landroid/view/LayoutInflater;

    .line 8
    :cond_1
    :goto_0
    iput-object p2, p0, Lc/b/p/o/k;->d:Lc/b/p/o/m;

    .line 9
    iget-object p1, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1}, Lc/b/p/o/j;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method public a(Lc/b/p/o/m;Z)V
    .locals 1

    .line 27
    iget-object v0, p0, Lc/b/p/o/k;->i:Lc/b/p/o/z$a;

    if-eqz v0, :cond_0

    .line 28
    invoke-interface {v0, p1, p2}, Lc/b/p/o/z$a;->a(Lc/b/p/o/m;Z)V

    :cond_0
    return-void
.end method

.method public a(Lc/b/p/o/z$a;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lc/b/p/o/k;->i:Lc/b/p/o/z$a;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 21
    iget-object p1, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lc/b/p/o/j;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public a(Lc/b/p/o/g0;)Z
    .locals 2

    .line 23
    invoke-virtual {p1}, Lc/b/p/o/m;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 24
    :cond_0
    new-instance v0, Lc/b/p/o/n;

    invoke-direct {v0, p1}, Lc/b/p/o/n;-><init>(Lc/b/p/o/m;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc/b/p/o/n;->a(Landroid/os/IBinder;)V

    .line 25
    iget-object v0, p0, Lc/b/p/o/k;->i:Lc/b/p/o/z$a;

    if-eqz v0, :cond_1

    .line 26
    invoke-interface {v0, p1}, Lc/b/p/o/z$a;->a(Lc/b/p/o/m;)Z

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public a(Lc/b/p/o/m;Lc/b/p/o/p;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Lc/b/p/o/m;Lc/b/p/o/p;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lc/b/p/o/k;->d:Lc/b/p/o/m;

    iget-object p2, p0, Lc/b/p/o/k;->j:Lc/b/p/o/j;

    invoke-virtual {p2, p3}, Lc/b/p/o/j;->getItem(I)Lc/b/p/o/p;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;Lc/b/p/o/z;I)Z

    return-void
.end method
