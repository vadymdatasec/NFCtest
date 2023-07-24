.class public Lc/h/n/p1;
.super Lc/h/n/o1;
.source "SourceFile"


# instance fields
.field public n:Lc/h/g/b;

.field public o:Lc/h/g/b;

.field public p:Lc/h/g/b;


# direct methods
.method public constructor <init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/h/n/o1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lc/h/n/p1;->n:Lc/h/g/b;

    .line 3
    iput-object p1, p0, Lc/h/n/p1;->o:Lc/h/g/b;

    .line 4
    iput-object p1, p0, Lc/h/n/p1;->p:Lc/h/g/b;

    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;Lc/h/n/p1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lc/h/n/o1;-><init>(Lc/h/n/u1;Lc/h/n/o1;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lc/h/n/p1;->n:Lc/h/g/b;

    .line 7
    iput-object p1, p0, Lc/h/n/p1;->o:Lc/h/g/b;

    .line 8
    iput-object p1, p0, Lc/h/n/p1;->p:Lc/h/g/b;

    return-void
.end method


# virtual methods
.method public b(Lc/h/g/b;)V
    .locals 0

    return-void
.end method

.method public e()Lc/h/g/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/p1;->o:Lc/h/g/b;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lc/h/g/b;->a(Landroid/graphics/Insets;)Lc/h/g/b;

    move-result-object v0

    iput-object v0, p0, Lc/h/n/p1;->o:Lc/h/g/b;

    .line 4
    :cond_0
    iget-object v0, p0, Lc/h/n/p1;->o:Lc/h/g/b;

    return-object v0
.end method

.method public g()Lc/h/g/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/p1;->n:Lc/h/g/b;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lc/h/g/b;->a(Landroid/graphics/Insets;)Lc/h/g/b;

    move-result-object v0

    iput-object v0, p0, Lc/h/n/p1;->n:Lc/h/g/b;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/h/n/p1;->n:Lc/h/g/b;

    return-object v0
.end method

.method public i()Lc/h/g/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/p1;->p:Lc/h/g/b;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lc/h/g/b;->a(Landroid/graphics/Insets;)Lc/h/g/b;

    move-result-object v0

    iput-object v0, p0, Lc/h/n/p1;->p:Lc/h/g/b;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/h/n/p1;->p:Lc/h/g/b;

    return-object v0
.end method
