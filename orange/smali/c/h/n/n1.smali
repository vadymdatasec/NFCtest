.class public Lc/h/n/n1;
.super Lc/h/n/m1;
.source "SourceFile"


# instance fields
.field public m:Lc/h/g/b;


# direct methods
.method public constructor <init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/h/n/m1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/h/n/n1;->m:Lc/h/g/b;

    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;Lc/h/n/n1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lc/h/n/m1;-><init>(Lc/h/n/u1;Lc/h/n/m1;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lc/h/n/n1;->m:Lc/h/g/b;

    .line 5
    iget-object p1, p2, Lc/h/n/n1;->m:Lc/h/g/b;

    iput-object p1, p0, Lc/h/n/n1;->m:Lc/h/g/b;

    return-void
.end method


# virtual methods
.method public b()Lc/h/n/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lc/h/n/u1;->a(Landroid/view/WindowInsets;)Lc/h/n/u1;

    move-result-object v0

    return-object v0
.end method

.method public b(Lc/h/g/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lc/h/n/n1;->m:Lc/h/g/b;

    return-void
.end method

.method public c()Lc/h/n/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lc/h/n/u1;->a(Landroid/view/WindowInsets;)Lc/h/n/u1;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lc/h/g/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lc/h/n/n1;->m:Lc/h/g/b;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    .line 4
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    .line 5
    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    .line 6
    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    .line 7
    invoke-static {v0, v1, v2, v3}, Lc/h/g/b;->a(IIII)Lc/h/g/b;

    move-result-object v0

    iput-object v0, p0, Lc/h/n/n1;->m:Lc/h/g/b;

    .line 8
    :cond_0
    iget-object v0, p0, Lc/h/n/n1;->m:Lc/h/g/b;

    return-object v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method
