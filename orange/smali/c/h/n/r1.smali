.class public Lc/h/n/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lc/h/n/u1;


# instance fields
.field public final a:Lc/h/n/u1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/h/n/h1;

    invoke-direct {v0}, Lc/h/n/h1;-><init>()V

    .line 2
    invoke-virtual {v0}, Lc/h/n/h1;->a()Lc/h/n/u1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/h/n/u1;->a()Lc/h/n/u1;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lc/h/n/u1;->b()Lc/h/n/u1;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lc/h/n/u1;->c()Lc/h/n/u1;

    move-result-object v0

    sput-object v0, Lc/h/n/r1;->b:Lc/h/n/u1;

    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/h/n/r1;->a:Lc/h/n/u1;

    return-void
.end method


# virtual methods
.method public a(I)Lc/h/g/b;
    .locals 0

    .line 2
    sget-object p1, Lc/h/g/b;->e:Lc/h/g/b;

    return-object p1
.end method

.method public a()Lc/h/n/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/r1;->a:Lc/h/n/u1;

    return-object v0
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public a(Lc/h/g/b;)V
    .locals 0

    return-void
.end method

.method public a(Lc/h/n/u1;)V
    .locals 0

    return-void
.end method

.method public a([Lc/h/g/b;)V
    .locals 0

    return-void
.end method

.method public b()Lc/h/n/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/r1;->a:Lc/h/n/u1;

    return-object v0
.end method

.method public b(Lc/h/g/b;)V
    .locals 0

    return-void
.end method

.method public b(Lc/h/n/u1;)V
    .locals 0

    return-void
.end method

.method public c()Lc/h/n/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/r1;->a:Lc/h/n/u1;

    return-object v0
.end method

.method public d()Lc/h/n/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Lc/h/g/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lc/h/n/r1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lc/h/n/r1;

    .line 3
    invoke-virtual {p0}, Lc/h/n/r1;->k()Z

    move-result v1

    invoke-virtual {p1}, Lc/h/n/r1;->k()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 4
    invoke-virtual {p0}, Lc/h/n/r1;->j()Z

    move-result v1

    invoke-virtual {p1}, Lc/h/n/r1;->j()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 5
    invoke-virtual {p0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v1

    invoke-virtual {p1}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v3

    invoke-static {v1, v3}, Lc/h/m/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p0}, Lc/h/n/r1;->f()Lc/h/g/b;

    move-result-object v1

    invoke-virtual {p1}, Lc/h/n/r1;->f()Lc/h/g/b;

    move-result-object v3

    invoke-static {v1, v3}, Lc/h/m/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p0}, Lc/h/n/r1;->d()Lc/h/n/h;

    move-result-object v1

    invoke-virtual {p1}, Lc/h/n/r1;->d()Lc/h/n/h;

    move-result-object p1

    invoke-static {v1, p1}, Lc/h/m/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Lc/h/g/b;
    .locals 1

    .line 1
    sget-object v0, Lc/h/g/b;->e:Lc/h/g/b;

    return-object v0
.end method

.method public g()Lc/h/g/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v0

    return-object v0
.end method

.method public h()Lc/h/g/b;
    .locals 1

    .line 1
    sget-object v0, Lc/h/g/b;->e:Lc/h/g/b;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Lc/h/n/r1;->k()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lc/h/n/r1;->j()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 2
    invoke-virtual {p0}, Lc/h/n/r1;->f()Lc/h/g/b;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lc/h/n/r1;->d()Lc/h/n/h;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 3
    invoke-static {v0}, Lc/h/m/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Lc/h/g/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/h/n/r1;->h()Lc/h/g/b;

    move-result-object v0

    return-object v0
.end method

.method public j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
