.class public Lm/b/h/d;
.super Lm/b/h/c;
.source "SourceFile"

# interfaces
.implements Lm/b/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm/b/h/c<",
        "Lm/b/d;",
        ">;",
        "Lm/b/d;"
    }
.end annotation


# instance fields
.field public e:Ljava/net/Proxy;

.field public f:I

.field public g:I

.field public h:Z

.field public i:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lm/b/b;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Lm/b/j/f0;

.field public n:Z

.field public o:Z

.field public p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lm/b/h/c;-><init>(Lm/b/h/b;)V

    .line 3
    iput-object v0, p0, Lm/b/h/d;->j:Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lm/b/h/d;->k:Z

    .line 5
    iput-boolean v0, p0, Lm/b/h/d;->l:Z

    .line 6
    iput-boolean v0, p0, Lm/b/h/d;->n:Z

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lm/b/h/d;->o:Z

    const-string v1, "UTF-8"

    .line 8
    iput-object v1, p0, Lm/b/h/d;->p:Ljava/lang/String;

    const/16 v1, 0x7530

    .line 9
    iput v1, p0, Lm/b/h/d;->f:I

    const/high16 v1, 0x100000

    .line 10
    iput v1, p0, Lm/b/h/d;->g:I

    .line 11
    iput-boolean v0, p0, Lm/b/h/d;->h:Z

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm/b/h/d;->i:Ljava/util/Collection;

    .line 13
    sget-object v0, Lm/b/c;->c:Lm/b/c;

    iput-object v0, p0, Lm/b/h/c;->b:Lm/b/c;

    .line 14
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    const-string v1, "Accept-Encoding"

    const-string v2, "gzip"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    const-string v1, "User-Agent"

    const-string v2, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-static {}, Lm/b/j/f0;->b()Lm/b/j/f0;

    move-result-object v0

    iput-object v0, p0, Lm/b/h/d;->m:Lm/b/j/f0;

    return-void
.end method

.method public synthetic constructor <init>(Lm/b/h/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/h/d;-><init>()V

    return-void
.end method

.method public static synthetic a(Lm/b/h/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lm/b/h/d;->n:Z

    return p0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 4
    iget v0, p0, Lm/b/h/d;->f:I

    return v0
.end method

.method public bridge synthetic a(I)Lm/b/d;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lm/b/h/d;->a(I)Lm/b/h/d;

    return-object p0
.end method

.method public bridge synthetic a(Lm/b/j/f0;)Lm/b/d;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lm/b/h/d;->a(Lm/b/j/f0;)Lm/b/h/d;

    return-object p0
.end method

.method public a(I)Lm/b/h/d;
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Timeout milliseconds must be 0 (infinite) or greater"

    .line 5
    invoke-static {v0, v1}, Lm/b/h/j;->b(ZLjava/lang/String;)V

    .line 6
    iput p1, p0, Lm/b/h/d;->f:I

    return-object p0
.end method

.method public a(Lm/b/j/f0;)Lm/b/h/d;
    .locals 0

    .line 7
    iput-object p1, p0, Lm/b/h/d;->m:Lm/b/j/f0;

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lm/b/h/d;->n:Z

    return-object p0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/h/d;->l:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/h/d;->k:Z

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/h/d;->p:Ljava/lang/String;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/h/d;->h:Z

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/h/d;->j:Ljava/lang/String;

    return-object v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lm/b/h/d;->g:I

    return v0
.end method

.method public m()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/h/d;->e:Ljava/net/Proxy;

    return-object v0
.end method

.method public n()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lm/b/b;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm/b/h/d;->i:Ljava/util/Collection;

    return-object v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/h/d;->o:Z

    return v0
.end method

.method public p()Lm/b/j/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/h/d;->m:Lm/b/j/f0;

    return-object v0
.end method
