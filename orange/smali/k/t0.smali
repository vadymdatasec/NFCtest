.class public Lk/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lk/f0;

.field public b:Ljava/lang/String;

.field public c:Lk/c0;

.field public d:Lk/x0;

.field public e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lk/t0;->e:Ljava/util/Map;

    const-string v0, "GET"

    .line 3
    iput-object v0, p0, Lk/t0;->b:Ljava/lang/String;

    .line 4
    new-instance v0, Lk/c0;

    invoke-direct {v0}, Lk/c0;-><init>()V

    iput-object v0, p0, Lk/t0;->c:Lk/c0;

    return-void
.end method

.method public constructor <init>(Lk/u0;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lk/t0;->e:Ljava/util/Map;

    .line 7
    iget-object v0, p1, Lk/u0;->a:Lk/f0;

    iput-object v0, p0, Lk/t0;->a:Lk/f0;

    .line 8
    iget-object v0, p1, Lk/u0;->b:Ljava/lang/String;

    iput-object v0, p0, Lk/t0;->b:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lk/u0;->d:Lk/x0;

    iput-object v0, p0, Lk/t0;->d:Lk/x0;

    .line 10
    iget-object v0, p1, Lk/u0;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p1, Lk/u0;->e:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    :goto_0
    iput-object v0, p0, Lk/t0;->e:Ljava/util/Map;

    .line 13
    iget-object p1, p1, Lk/u0;->c:Lk/d0;

    invoke-virtual {p1}, Lk/d0;->a()Lk/c0;

    move-result-object p1

    iput-object p1, p0, Lk/t0;->c:Lk/c0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lk/t0;
    .locals 1

    .line 4
    iget-object v0, p0, Lk/t0;->c:Lk/c0;

    invoke-virtual {v0, p1}, Lk/c0;->b(Ljava/lang/String;)Lk/c0;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
    .locals 1

    .line 3
    iget-object v0, p0, Lk/t0;->c:Lk/c0;

    invoke-virtual {v0, p1, p2}, Lk/c0;->c(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0
.end method

.method public a(Ljava/lang/String;Lk/x0;)Lk/t0;
    .locals 2

    if-eqz p1, :cond_5

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "method "

    if-eqz p2, :cond_1

    .line 10
    invoke-static {p1}, Lk/e1/i/h;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-nez p2, :cond_3

    .line 12
    invoke-static {p1}, Lk/e1/i/h;->e(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 13
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must have a request body."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 14
    :cond_3
    :goto_1
    iput-object p1, p0, Lk/t0;->b:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lk/t0;->d:Lk/x0;

    return-object p0

    .line 16
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.length() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lk/d0;)Lk/t0;
    .locals 0

    .line 5
    invoke-virtual {p1}, Lk/d0;->a()Lk/c0;

    move-result-object p1

    iput-object p1, p0, Lk/t0;->c:Lk/c0;

    return-object p0
.end method

.method public a(Lk/f0;)Lk/t0;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lk/t0;->a:Lk/f0;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lk/f;)Lk/t0;
    .locals 2

    .line 6
    invoke-virtual {p1}, Lk/f;->toString()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, "Cache-Control"

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lk/t0;->a(Ljava/lang/String;)Lk/t0;

    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0, v1, p1}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    return-object p0
.end method

.method public a()Lk/u0;
    .locals 2

    .line 18
    iget-object v0, p0, Lk/t0;->a:Lk/f0;

    if-eqz v0, :cond_0

    .line 19
    new-instance v0, Lk/u0;

    invoke-direct {v0, p0}, Lk/u0;-><init>(Lk/t0;)V

    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
