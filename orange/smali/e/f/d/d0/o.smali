.class public Le/f/d/d0/o;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Le/f/d/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Le/f/d/q;

.field public final synthetic e:Le/f/d/e0/a;

.field public final synthetic f:Le/f/d/d0/p;


# direct methods
.method public constructor <init>(Le/f/d/d0/p;ZZLe/f/d/q;Le/f/d/e0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/d/d0/o;->f:Le/f/d/d0/p;

    iput-boolean p2, p0, Le/f/d/d0/o;->b:Z

    iput-boolean p3, p0, Le/f/d/d0/o;->c:Z

    iput-object p4, p0, Le/f/d/d0/o;->d:Le/f/d/q;

    iput-object p5, p0, Le/f/d/d0/o;->e:Le/f/d/e0/a;

    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Le/f/d/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Le/f/d/d0/o;->a:Le/f/d/a0;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Le/f/d/d0/o;->d:Le/f/d/q;

    iget-object v1, p0, Le/f/d/d0/o;->f:Le/f/d/d0/p;

    iget-object v2, p0, Le/f/d/d0/o;->e:Le/f/d/e0/a;

    invoke-virtual {v0, v1, v2}, Le/f/d/q;->a(Le/f/d/b0;Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object v0

    iput-object v0, p0, Le/f/d/d0/o;->a:Le/f/d/a0;

    :goto_0
    return-object v0
.end method

.method public a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/c;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/f/d/d0/o;->b:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Le/f/d/f0/c;->J()V

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0}, Le/f/d/d0/o;->a()Le/f/d/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/g;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget-boolean v0, p0, Le/f/d/d0/o;->c:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p1}, Le/f/d/f0/g;->s()Le/f/d/f0/g;

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Le/f/d/d0/o;->a()Le/f/d/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V

    return-void
.end method
