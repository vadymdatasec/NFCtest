.class public Lc/h/n/j1;
.super Lc/h/n/l1;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/h/n/l1;-><init>()V

    .line 2
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lc/h/n/l1;-><init>(Lc/h/n/u1;)V

    .line 4
    invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public a(Lc/h/g/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public b()Lc/h/n/u1;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lc/h/n/l1;->a()V

    .line 3
    iget-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    .line 4
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lc/h/n/u1;->a(Landroid/view/WindowInsets;)Lc/h/n/u1;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lc/h/n/l1;->b:[Lc/h/g/b;

    invoke-virtual {v0, v1}, Lc/h/n/u1;->a([Lc/h/g/b;)V

    return-object v0
.end method

.method public b(Lc/h/g/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public c(Lc/h/g/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public d(Lc/h/g/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public e(Lc/h/g/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
