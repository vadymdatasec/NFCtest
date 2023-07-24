.class public Lm/b/i/i;
.super Lm/b/i/l;
.source "SourceFile"


# instance fields
.field public i:Lm/b/i/g;

.field public j:Lm/b/i/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lm/b/j/e0;->c:Lm/b/j/e0;

    const-string v1, "#root"

    invoke-static {v1, v0}, Lm/b/j/g0;->a(Ljava/lang/String;Lm/b/j/e0;)Lm/b/j/g0;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lm/b/i/g;

    invoke-direct {p1}, Lm/b/i/g;-><init>()V

    iput-object p1, p0, Lm/b/i/i;->i:Lm/b/i/g;

    .line 3
    sget-object p1, Lm/b/i/h;->b:Lm/b/i/h;

    iput-object p1, p0, Lm/b/i/i;->j:Lm/b/i/h;

    return-void
.end method


# virtual methods
.method public E()Lm/b/i/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/i;->i:Lm/b/i/g;

    return-object v0
.end method

.method public F()Lm/b/i/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/i;->j:Lm/b/i/h;

    return-object v0
.end method

.method public a(Lm/b/i/h;)Lm/b/i/i;
    .locals 0

    .line 1
    iput-object p1, p0, Lm/b/i/i;->j:Lm/b/i/h;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lm/b/i/i;->clone()Lm/b/i/i;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lm/b/i/i;
    .locals 2

    .line 4
    invoke-super {p0}, Lm/b/i/l;->clone()Lm/b/i/l;

    move-result-object v0

    check-cast v0, Lm/b/i/i;

    .line 5
    iget-object v1, p0, Lm/b/i/i;->i:Lm/b/i/g;

    invoke-virtual {v1}, Lm/b/i/g;->clone()Lm/b/i/g;

    move-result-object v1

    iput-object v1, v0, Lm/b/i/i;->i:Lm/b/i/g;

    return-object v0
.end method

.method public bridge synthetic clone()Lm/b/i/l;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lm/b/i/i;->clone()Lm/b/i/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lm/b/i/t;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lm/b/i/i;->clone()Lm/b/i/i;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "#document"

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lm/b/i/l;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
