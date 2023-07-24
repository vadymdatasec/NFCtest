.class public Lc/b/q/i;
.super Lc/b/p/o/y;
.source "SourceFile"


# instance fields
.field public final synthetic m:Lc/b/q/k;


# direct methods
.method public constructor <init>(Lc/b/q/k;Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;Z)V
    .locals 6

    .line 1
    iput-object p1, p0, Lc/b/q/i;->m:Lc/b/q/k;

    .line 2
    sget v5, Lc/b/a;->actionOverflowMenuStyle:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    invoke-direct/range {v0 .. v5}, Lc/b/p/o/y;-><init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;ZI)V

    const p2, 0x800005

    .line 3
    invoke-virtual {p0, p2}, Lc/b/p/o/y;->a(I)V

    .line 4
    iget-object p1, p1, Lc/b/q/k;->B:Lc/b/q/j;

    invoke-virtual {p0, p1}, Lc/b/p/o/y;->a(Lc/b/p/o/z$a;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/i;->m:Lc/b/q/k;

    invoke-static {v0}, Lc/b/q/k;->a(Lc/b/q/k;)Lc/b/p/o/m;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/q/i;->m:Lc/b/q/k;

    invoke-static {v0}, Lc/b/q/k;->b(Lc/b/q/k;)Lc/b/p/o/m;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/p/o/m;->close()V

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/q/i;->m:Lc/b/q/k;

    const/4 v1, 0x0

    iput-object v1, v0, Lc/b/q/k;->x:Lc/b/q/i;

    .line 4
    invoke-super {p0}, Lc/b/p/o/y;->e()V

    return-void
.end method
