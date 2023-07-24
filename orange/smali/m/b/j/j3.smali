.class public abstract Lm/b/j/j3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lm/b/j/a;

.field public b:Lm/b/j/s0;

.field public c:Lm/b/i/i;

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lm/b/i/l;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/String;

.field public f:Lm/b/j/q0;

.field public g:Lm/b/j/d0;

.field public h:Lm/b/j/e0;

.field public i:Lm/b/j/n0;

.field public j:Lm/b/j/m0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lm/b/j/n0;

    invoke-direct {v0}, Lm/b/j/n0;-><init>()V

    iput-object v0, p0, Lm/b/j/j3;->i:Lm/b/j/n0;

    .line 3
    new-instance v0, Lm/b/j/m0;

    invoke-direct {v0}, Lm/b/j/m0;-><init>()V

    iput-object v0, p0, Lm/b/j/j3;->j:Lm/b/j/m0;

    return-void
.end method


# virtual methods
.method public a()Lm/b/i/l;
    .locals 2

    .line 18
    iget-object v0, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 19
    iget-object v1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/i/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)V
    .locals 1

    const-string v0, "String input must not be null"

    .line 1
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BaseURI must not be null"

    .line 2
    invoke-static {p2, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lm/b/i/i;

    invoke-direct {v0, p2}, Lm/b/i/i;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lm/b/j/j3;->c:Lm/b/i/i;

    .line 4
    iput-object p4, p0, Lm/b/j/j3;->h:Lm/b/j/e0;

    .line 5
    new-instance p4, Lm/b/j/a;

    invoke-direct {p4, p1}, Lm/b/j/a;-><init>(Ljava/lang/String;)V

    iput-object p4, p0, Lm/b/j/j3;->a:Lm/b/j/a;

    .line 6
    iput-object p3, p0, Lm/b/j/j3;->g:Lm/b/j/d0;

    .line 7
    new-instance p1, Lm/b/j/s0;

    iget-object p4, p0, Lm/b/j/j3;->a:Lm/b/j/a;

    invoke-direct {p1, p4, p3}, Lm/b/j/s0;-><init>(Lm/b/j/a;Lm/b/j/d0;)V

    iput-object p1, p0, Lm/b/j/j3;->b:Lm/b/j/s0;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    const/16 p3, 0x20

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lm/b/j/j3;->d:Ljava/util/ArrayList;

    .line 9
    iput-object p2, p0, Lm/b/j/j3;->e:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 2

    .line 15
    iget-object v0, p0, Lm/b/j/j3;->f:Lm/b/j/q0;

    iget-object v1, p0, Lm/b/j/j3;->j:Lm/b/j/m0;

    if-ne v0, v1, :cond_0

    .line 16
    new-instance v0, Lm/b/j/m0;

    invoke-direct {v0}, Lm/b/j/m0;-><init>()V

    invoke-virtual {v0, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;

    invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 17
    :cond_0
    invoke-virtual {v1}, Lm/b/j/o0;->l()Lm/b/j/o0;

    invoke-virtual {v1, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;

    invoke-virtual {p0, v1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;Lm/b/i/b;)Z
    .locals 2

    .line 10
    iget-object v0, p0, Lm/b/j/j3;->f:Lm/b/j/q0;

    iget-object v1, p0, Lm/b/j/j3;->i:Lm/b/j/n0;

    if-ne v0, v1, :cond_0

    .line 11
    new-instance v0, Lm/b/j/n0;

    invoke-direct {v0}, Lm/b/j/n0;-><init>()V

    invoke-virtual {v0, p1, p2}, Lm/b/j/n0;->a(Ljava/lang/String;Lm/b/i/b;)Lm/b/j/n0;

    invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 12
    :cond_0
    invoke-virtual {v1}, Lm/b/j/n0;->l()Lm/b/j/o0;

    .line 13
    iget-object v0, p0, Lm/b/j/j3;->i:Lm/b/j/n0;

    invoke-virtual {v0, p1, p2}, Lm/b/j/n0;->a(Ljava/lang/String;Lm/b/i/b;)Lm/b/j/n0;

    .line 14
    iget-object p1, p0, Lm/b/j/j3;->i:Lm/b/j/n0;

    invoke-virtual {p0, p1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method

.method public abstract a(Lm/b/j/q0;)Z
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)Lm/b/i/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lm/b/j/j3;->a(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)V

    .line 2
    invoke-virtual {p0}, Lm/b/j/j3;->c()V

    .line 3
    iget-object p1, p0, Lm/b/j/j3;->c:Lm/b/i/i;

    return-object p1
.end method

.method public abstract b()Lm/b/j/e0;
.end method

.method public b(Ljava/lang/String;)Z
    .locals 2

    .line 4
    iget-object v0, p0, Lm/b/j/j3;->f:Lm/b/j/q0;

    iget-object v1, p0, Lm/b/j/j3;->i:Lm/b/j/n0;

    if-ne v0, v1, :cond_0

    .line 5
    new-instance v0, Lm/b/j/n0;

    invoke-direct {v0}, Lm/b/j/n0;-><init>()V

    invoke-virtual {v0, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;

    invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 6
    :cond_0
    invoke-virtual {v1}, Lm/b/j/n0;->l()Lm/b/j/o0;

    invoke-virtual {v1, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;

    invoke-virtual {p0, v1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method

.method public c()V
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lm/b/j/j3;->b:Lm/b/j/s0;

    invoke-virtual {v0}, Lm/b/j/s0;->j()Lm/b/j/q0;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    .line 3
    invoke-virtual {v0}, Lm/b/j/q0;->l()Lm/b/j/q0;

    .line 4
    iget-object v0, v0, Lm/b/j/q0;->a:Lm/b/j/p0;

    sget-object v1, Lm/b/j/p0;->g:Lm/b/j/p0;

    if-ne v0, v1, :cond_0

    return-void
.end method
