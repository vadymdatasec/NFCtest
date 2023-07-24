.class public final Lk/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk/f0;

.field public final b:Ljava/lang/String;

.field public final c:Lk/d0;

.field public final d:Lk/x0;

.field public final e:Ljava/util/Map;
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

.field public volatile f:Lk/f;


# direct methods
.method public constructor <init>(Lk/t0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lk/t0;->a:Lk/f0;

    iput-object v0, p0, Lk/u0;->a:Lk/f0;

    .line 3
    iget-object v0, p1, Lk/t0;->b:Ljava/lang/String;

    iput-object v0, p0, Lk/u0;->b:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lk/t0;->c:Lk/c0;

    invoke-virtual {v0}, Lk/c0;->a()Lk/d0;

    move-result-object v0

    iput-object v0, p0, Lk/u0;->c:Lk/d0;

    .line 5
    iget-object v0, p1, Lk/t0;->d:Lk/x0;

    iput-object v0, p0, Lk/u0;->d:Lk/x0;

    .line 6
    iget-object p1, p1, Lk/t0;->e:Ljava/util/Map;

    invoke-static {p1}, Lk/e1/e;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lk/u0;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/u0;->c:Lk/d0;

    invoke-virtual {v0, p1}, Lk/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a()Lk/x0;
    .locals 1

    .line 2
    iget-object v0, p0, Lk/u0;->d:Lk/x0;

    return-object v0
.end method

.method public b()Lk/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/u0;->f:Lk/f;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lk/u0;->c:Lk/d0;

    invoke-static {v0}, Lk/f;->a(Lk/d0;)Lk/f;

    move-result-object v0

    iput-object v0, p0, Lk/u0;->f:Lk/f;

    :goto_0
    return-object v0
.end method

.method public c()Lk/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/u0;->c:Lk/d0;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/u0;->a:Lk/f0;

    invoke-virtual {v0}, Lk/f0;->h()Z

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/u0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lk/t0;
    .locals 1

    .line 1
    new-instance v0, Lk/t0;

    invoke-direct {v0, p0}, Lk/t0;-><init>(Lk/u0;)V

    return-object v0
.end method

.method public g()Lk/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/u0;->a:Lk/f0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/u0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/u0;->a:Lk/f0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/u0;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
