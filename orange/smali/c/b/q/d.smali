.class public Lc/b/q/d;
.super Lc/b/p/o/y;
.source "SourceFile"


# instance fields
.field public final synthetic m:Lc/b/q/k;


# direct methods
.method public constructor <init>(Lc/b/q/k;Landroid/content/Context;Lc/b/p/o/g0;Landroid/view/View;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lc/b/q/d;->m:Lc/b/q/k;

    .line 2
    sget v5, Lc/b/a;->actionOverflowMenuStyle:I

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lc/b/p/o/y;-><init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;ZI)V

    .line 3
    invoke-virtual {p3}, Lc/b/p/o/g0;->getItem()Landroid/view/MenuItem;

    move-result-object p2

    check-cast p2, Lc/b/p/o/p;

    .line 4
    invoke-virtual {p2}, Lc/b/p/o/p;->h()Z

    move-result p2

    if-nez p2, :cond_1

    .line 5
    iget-object p2, p1, Lc/b/q/k;->j:Lc/b/q/h;

    if-nez p2, :cond_0

    invoke-static {p1}, Lc/b/q/k;->c(Lc/b/q/k;)Lc/b/p/o/a0;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    :cond_0
    invoke-virtual {p0, p2}, Lc/b/p/o/y;->a(Landroid/view/View;)V

    .line 6
    :cond_1
    iget-object p1, p1, Lc/b/q/k;->B:Lc/b/q/j;

    invoke-virtual {p0, p1}, Lc/b/p/o/y;->a(Lc/b/p/o/z$a;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/d;->m:Lc/b/q/k;

    const/4 v1, 0x0

    iput-object v1, v0, Lc/b/q/k;->y:Lc/b/q/d;

    const/4 v1, 0x0

    .line 2
    iput v1, v0, Lc/b/q/k;->C:I

    .line 3
    invoke-super {p0}, Lc/b/p/o/y;->e()V

    return-void
.end method
