.class public Lc/h/n/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/h/n/r1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 2
    sget-object v0, Lc/h/n/q1;->q:Lc/h/n/u1;

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lc/h/n/r1;->b:Lc/h/n/u1;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lc/h/n/q1;

    invoke-direct {v0, p0, p1}, Lc/h/n/q1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lc/h/n/p1;

    invoke-direct {v0, p0, p1}, Lc/h/n/p1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Lc/h/n/o1;

    invoke-direct {v0, p0, p1}, Lc/h/n/o1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, Lc/h/n/n1;

    invoke-direct {v0, p0, p1}, Lc/h/n/n1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    :cond_3
    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    .line 7
    new-instance v0, Lc/h/n/m1;

    invoke-direct {v0, p0, p1}, Lc/h/n/m1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    .line 8
    :cond_4
    new-instance p1, Lc/h/n/r1;

    invoke-direct {p1, p0}, Lc/h/n/r1;-><init>(Lc/h/n/u1;)V

    iput-object p1, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    .line 10
    iget-object p1, p1, Lc/h/n/u1;->a:Lc/h/n/r1;

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v0, p1, Lc/h/n/q1;

    if-eqz v0, :cond_0

    .line 12
    new-instance v0, Lc/h/n/q1;

    move-object v1, p1

    check-cast v1, Lc/h/n/q1;

    invoke-direct {v0, p0, v1}, Lc/h/n/q1;-><init>(Lc/h/n/u1;Lc/h/n/q1;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    .line 13
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    instance-of v0, p1, Lc/h/n/p1;

    if-eqz v0, :cond_1

    .line 14
    new-instance v0, Lc/h/n/p1;

    move-object v1, p1

    check-cast v1, Lc/h/n/p1;

    invoke-direct {v0, p0, v1}, Lc/h/n/p1;-><init>(Lc/h/n/u1;Lc/h/n/p1;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    .line 15
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    instance-of v0, p1, Lc/h/n/o1;

    if-eqz v0, :cond_2

    .line 16
    new-instance v0, Lc/h/n/o1;

    move-object v1, p1

    check-cast v1, Lc/h/n/o1;

    invoke-direct {v0, p0, v1}, Lc/h/n/o1;-><init>(Lc/h/n/u1;Lc/h/n/o1;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    .line 17
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    instance-of v0, p1, Lc/h/n/n1;

    if-eqz v0, :cond_3

    .line 18
    new-instance v0, Lc/h/n/n1;

    move-object v1, p1

    check-cast v1, Lc/h/n/n1;

    invoke-direct {v0, p0, v1}, Lc/h/n/n1;-><init>(Lc/h/n/u1;Lc/h/n/n1;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    .line 19
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    instance-of v0, p1, Lc/h/n/m1;

    if-eqz v0, :cond_4

    .line 20
    new-instance v0, Lc/h/n/m1;

    move-object v1, p1

    check-cast v1, Lc/h/n/m1;

    invoke-direct {v0, p0, v1}, Lc/h/n/m1;-><init>(Lc/h/n/u1;Lc/h/n/m1;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    goto :goto_0

    .line 21
    :cond_4
    new-instance v0, Lc/h/n/r1;

    invoke-direct {v0, p0}, Lc/h/n/r1;-><init>(Lc/h/n/u1;)V

    iput-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    .line 22
    :goto_0
    invoke-virtual {p1, p0}, Lc/h/n/r1;->a(Lc/h/n/u1;)V

    goto :goto_1

    .line 23
    :cond_5
    new-instance p1, Lc/h/n/r1;

    invoke-direct {p1, p0}, Lc/h/n/r1;-><init>(Lc/h/n/u1;)V

    iput-object p1, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    :goto_1
    return-void
.end method

.method public static a(Landroid/view/WindowInsets;)Lc/h/n/u1;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lc/h/n/u1;->a(Landroid/view/WindowInsets;Landroid/view/View;)Lc/h/n/u1;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/view/WindowInsets;Landroid/view/View;)Lc/h/n/u1;
    .locals 1

    .line 2
    new-instance v0, Lc/h/n/u1;

    invoke-static {p0}, Lc/h/m/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, Lc/h/n/u1;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1}, Lc/h/n/v0;->C(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 4
    invoke-static {p1}, Lc/h/n/v0;->t(Landroid/view/View;)Lc/h/n/u1;

    move-result-object p0

    invoke-virtual {v0, p0}, Lc/h/n/u1;->a(Lc/h/n/u1;)V

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Lc/h/n/u1;->a(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(I)Lc/h/g/b;
    .locals 1

    .line 10
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0, p1}, Lc/h/n/r1;->a(I)Lc/h/g/b;

    move-result-object p1

    return-object p1
.end method

.method public a()Lc/h/n/u1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 9
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->a()Lc/h/n/u1;

    move-result-object v0

    return-object v0
.end method

.method public a(IIII)Lc/h/n/u1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    new-instance v0, Lc/h/n/h1;

    invoke-direct {v0, p0}, Lc/h/n/h1;-><init>(Lc/h/n/u1;)V

    .line 7
    invoke-static {p1, p2, p3, p4}, Lc/h/g/b;->a(IIII)Lc/h/g/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/h/n/h1;->b(Lc/h/g/b;)Lc/h/n/h1;

    .line 8
    invoke-virtual {v0}, Lc/h/n/h1;->a()Lc/h/n/u1;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .line 14
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0, p1}, Lc/h/n/r1;->a(Landroid/view/View;)V

    return-void
.end method

.method public a(Lc/h/g/b;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0, p1}, Lc/h/n/r1;->a(Lc/h/g/b;)V

    return-void
.end method

.method public a(Lc/h/n/u1;)V
    .locals 1

    .line 12
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0, p1}, Lc/h/n/r1;->b(Lc/h/n/u1;)V

    return-void
.end method

.method public a([Lc/h/g/b;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0, p1}, Lc/h/n/r1;->a([Lc/h/g/b;)V

    return-void
.end method

.method public b()Lc/h/n/u1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->b()Lc/h/n/u1;

    move-result-object v0

    return-object v0
.end method

.method public b(Lc/h/g/b;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0, p1}, Lc/h/n/r1;->b(Lc/h/g/b;)V

    return-void
.end method

.method public c()Lc/h/n/u1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->c()Lc/h/n/u1;

    move-result-object v0

    return-object v0
.end method

.method public d()Lc/h/n/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->d()Lc/h/n/h;

    move-result-object v0

    return-object v0
.end method

.method public e()Lc/h/g/b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->f()Lc/h/g/b;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lc/h/n/u1;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    check-cast p1, Lc/h/n/u1;

    .line 3
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    iget-object p1, p1, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-static {v0, p1}, Lc/h/m/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v0

    iget v0, v0, Lc/h/g/b;->d:I

    return v0
.end method

.method public g()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v0

    iget v0, v0, Lc/h/g/b;->a:I

    return v0
.end method

.method public h()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v0

    iget v0, v0, Lc/h/g/b;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lc/h/n/r1;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v0

    iget v0, v0, Lc/h/g/b;->b:I

    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    invoke-virtual {v0}, Lc/h/n/r1;->j()Z

    move-result v0

    return v0
.end method

.method public k()Landroid/view/WindowInsets;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h/n/u1;->a:Lc/h/n/r1;

    instance-of v1, v0, Lc/h/n/m1;

    if-eqz v1, :cond_0

    check-cast v0, Lc/h/n/m1;

    iget-object v0, v0, Lc/h/n/m1;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
