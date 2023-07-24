.class public final Lk/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll/i;

.field public b:Lk/i0;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/k0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lk/j0;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lk/l0;->e:Lk/i0;

    iput-object v0, p0, Lk/j0;->b:Lk/i0;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/j0;->c:Ljava/util/List;

    .line 5
    invoke-static {p1}, Ll/i;->c(Ljava/lang/String;)Ll/i;

    move-result-object p1

    iput-object p1, p0, Lk/j0;->a:Ll/i;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lk/j0;
    .locals 0

    .line 5
    invoke-static {p1, p2}, Lk/k0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/k0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk/j0;->a(Lk/k0;)Lk/j0;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lk/x0;)Lk/j0;
    .locals 0

    .line 6
    invoke-static {p1, p2, p3}, Lk/k0;->a(Ljava/lang/String;Ljava/lang/String;Lk/x0;)Lk/k0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk/j0;->a(Lk/k0;)Lk/j0;

    return-object p0
.end method

.method public a(Lk/i0;)Lk/j0;
    .locals 3

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lk/i0;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "multipart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iput-object p1, p0, Lk/j0;->b:Lk/i0;

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "multipart != "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lk/k0;)Lk/j0;
    .locals 1

    if-eqz p1, :cond_0

    .line 7
    iget-object v0, p0, Lk/j0;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "part == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Lk/l0;
    .locals 4

    .line 9
    iget-object v0, p0, Lk/j0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    new-instance v0, Lk/l0;

    iget-object v1, p0, Lk/j0;->a:Ll/i;

    iget-object v2, p0, Lk/j0;->b:Lk/i0;

    iget-object v3, p0, Lk/j0;->c:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lk/l0;-><init>(Ll/i;Lk/i0;Ljava/util/List;)V

    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Multipart body must have at least one part."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
