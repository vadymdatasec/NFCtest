.class public Lc/c/a/b/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lc/c/a/b/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/c/a/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "Lc/c/a/b/g<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public b:Lc/c/a/b/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public final synthetic d:Lc/c/a/b/e;


# direct methods
.method public constructor <init>(Lc/c/a/b/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/c/a/b/e$a;->d:Lc/c/a/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/c/a/b/e$a;->c:Z

    return-void
.end method


# virtual methods
.method public a(Lc/c/a/b/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/c/a/b/e$a;->b:Lc/c/a/b/d;

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, v0, Lc/c/a/b/d;->e:Lc/c/a/b/d;

    iput-object p1, p0, Lc/c/a/b/e$a;->b:Lc/c/a/b/d;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    :goto_0
    iput-boolean p1, p0, Lc/c/a/b/e$a;->c:Z

    :cond_1
    return-void
.end method

.method public hasNext()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc/c/a/b/e$a;->c:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lc/c/a/b/e$a;->d:Lc/c/a/b/e;

    iget-object v0, v0, Lc/c/a/b/e;->b:Lc/c/a/b/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 3
    :cond_1
    iget-object v0, p0, Lc/c/a/b/e$a;->b:Lc/c/a/b/d;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lc/c/a/b/d;->d:Lc/c/a/b/d;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/c/a/b/e$a;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Lc/c/a/b/e$a;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lc/c/a/b/e$a;->c:Z

    .line 4
    iget-object v0, p0, Lc/c/a/b/e$a;->d:Lc/c/a/b/e;

    iget-object v0, v0, Lc/c/a/b/e;->b:Lc/c/a/b/d;

    iput-object v0, p0, Lc/c/a/b/e$a;->b:Lc/c/a/b/d;

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lc/c/a/b/e$a;->b:Lc/c/a/b/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lc/c/a/b/d;->d:Lc/c/a/b/d;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lc/c/a/b/e$a;->b:Lc/c/a/b/d;

    .line 6
    :goto_1
    iget-object v0, p0, Lc/c/a/b/e$a;->b:Lc/c/a/b/d;

    return-object v0
.end method
