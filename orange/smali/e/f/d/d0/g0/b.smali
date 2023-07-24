.class public final Le/f/d/d0/g0/b;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/d/a0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Le/f/d/b0;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final b:Le/f/d/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/a0<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/d/d0/g0/a;

    invoke-direct {v0}, Le/f/d/d0/g0/a;-><init>()V

    sput-object v0, Le/f/d/d0/g0/b;->c:Le/f/d/b0;

    return-void
.end method

.method public constructor <init>(Le/f/d/q;Le/f/d/a0;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/q;",
            "Le/f/d/a0<",
            "TE;>;",
            "Ljava/lang/Class<",
            "TE;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    .line 2
    new-instance v0, Le/f/d/d0/g0/v;

    invoke-direct {v0, p1, p2, p3}, Le/f/d/d0/g0/v;-><init>(Le/f/d/q;Le/f/d/a0;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Le/f/d/d0/g0/b;->b:Le/f/d/a0;

    .line 3
    iput-object p3, p0, Le/f/d/d0/g0/b;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v0

    sget-object v1, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Le/f/d/f0/c;->B()V

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual {p1}, Le/f/d/f0/c;->l()V

    .line 5
    :goto_0
    invoke-virtual {p1}, Le/f/d/f0/c;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Le/f/d/d0/g0/b;->b:Le/f/d/a0;

    invoke-virtual {v1, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1}, Le/f/d/f0/c;->q()V

    .line 9
    iget-object p1, p0, Le/f/d/d0/g0/b;->a:Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    .line 10
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v1, v2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 12
    invoke-virtual {p1}, Le/f/d/f0/g;->s()Le/f/d/f0/g;

    return-void

    .line 13
    :cond_0
    invoke-virtual {p1}, Le/f/d/f0/g;->l()Le/f/d/f0/g;

    const/4 v0, 0x0

    .line 14
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    .line 15
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    .line 16
    iget-object v3, p0, Le/f/d/d0/g0/b;->b:Le/f/d/a0;

    invoke-virtual {v3, p1, v2}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Le/f/d/f0/g;->n()Le/f/d/f0/g;

    return-void
.end method
