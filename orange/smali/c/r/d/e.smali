.class public Lc/r/d/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lc/r/d/n;


# direct methods
.method public constructor <init>(Lc/r/d/n;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/r/d/e;->c:Lc/r/d/n;

    iput-object p2, p0, Lc/r/d/e;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/r/d/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/r/d/l;

    .line 2
    iget-object v2, p0, Lc/r/d/e;->c:Lc/r/d/n;

    invoke-virtual {v2, v1}, Lc/r/d/n;->a(Lc/r/d/l;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/r/d/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget-object v0, p0, Lc/r/d/e;->c:Lc/r/d/n;

    iget-object v0, v0, Lc/r/d/n;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lc/r/d/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
