.class public Lc/l/d/o;
.super Lc/l/d/p;
.source "SourceFile"


# instance fields
.field public c:Z

.field public d:Z

.field public e:Lc/l/d/k0;


# direct methods
.method public constructor <init>(Lc/l/d/h3;Lc/h/j/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lc/l/d/p;-><init>(Lc/l/d/h3;Lc/h/j/c;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lc/l/d/o;->d:Z

    .line 3
    iput-boolean p3, p0, Lc/l/d/o;->c:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lc/l/d/k0;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc/l/d/o;->d:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lc/l/d/o;->e:Lc/l/d/k0;

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v0

    invoke-virtual {v0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v1

    invoke-virtual {v1}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v1

    sget-object v2, Lc/l/d/g3;->c:Lc/l/d/g3;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Lc/l/d/o;->c:Z

    .line 5
    invoke-static {p1, v0, v1, v2}, Lc/l/d/m0;->a(Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Lc/l/d/k0;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/o;->e:Lc/l/d/k0;

    .line 6
    iput-boolean v3, p0, Lc/l/d/o;->d:Z

    return-object p1
.end method
