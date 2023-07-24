.class public Le/f/d/d0/g0/n;
.super Le/f/d/d0/g0/p;
.source "SourceFile"


# instance fields
.field public final d:Le/f/d/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/a0<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic e:Le/f/d/q;

.field public final synthetic f:Le/f/d/e0/a;

.field public final synthetic g:Ljava/lang/reflect/Field;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Le/f/d/d0/g0/q;Ljava/lang/String;ZZLe/f/d/q;Le/f/d/e0/a;Ljava/lang/reflect/Field;Z)V
    .locals 0

    .line 1
    iput-object p5, p0, Le/f/d/d0/g0/n;->e:Le/f/d/q;

    iput-object p6, p0, Le/f/d/d0/g0/n;->f:Le/f/d/e0/a;

    iput-object p7, p0, Le/f/d/d0/g0/n;->g:Ljava/lang/reflect/Field;

    iput-boolean p8, p0, Le/f/d/d0/g0/n;->h:Z

    invoke-direct {p0, p2, p3, p4}, Le/f/d/d0/g0/p;-><init>(Ljava/lang/String;ZZ)V

    .line 2
    iget-object p1, p0, Le/f/d/d0/g0/n;->e:Le/f/d/q;

    iget-object p2, p0, Le/f/d/d0/g0/n;->f:Le/f/d/e0/a;

    invoke-virtual {p1, p2}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object p1

    iput-object p1, p0, Le/f/d/d0/g0/n;->d:Le/f/d/a0;

    return-void
.end method


# virtual methods
.method public a(Le/f/d/f0/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/f/d/d0/g0/n;->d:Le/f/d/a0;

    invoke-virtual {v0, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    .line 5
    iget-boolean v0, p0, Le/f/d/d0/g0/n;->h:Z

    if-nez v0, :cond_1

    .line 6
    :cond_0
    iget-object v0, p0, Le/f/d/d0/g0/n;->g:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/g0/n;->g:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 2
    new-instance v0, Le/f/d/d0/g0/v;

    iget-object v1, p0, Le/f/d/d0/g0/n;->e:Le/f/d/q;

    iget-object v2, p0, Le/f/d/d0/g0/n;->d:Le/f/d/a0;

    iget-object v3, p0, Le/f/d/d0/g0/n;->f:Le/f/d/e0/a;

    invoke-virtual {v3}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Le/f/d/d0/g0/v;-><init>(Le/f/d/q;Le/f/d/a0;Ljava/lang/reflect/Type;)V

    .line 3
    invoke-virtual {v0, p1, p2}, Le/f/d/d0/g0/v;->a(Le/f/d/f0/g;Ljava/lang/Object;)V

    return-void
.end method
