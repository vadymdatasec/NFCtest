.class public final Le/f/d/d0/g0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/d/b0;


# instance fields
.field public final b:Le/f/d/d0/n;

.field public final c:Le/f/d/i;

.field public final d:Le/f/d/d0/p;


# direct methods
.method public constructor <init>(Le/f/d/d0/n;Le/f/d/i;Le/f/d/d0/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/d/d0/g0/q;->b:Le/f/d/d0/n;

    .line 3
    iput-object p2, p0, Le/f/d/d0/g0/q;->c:Le/f/d/i;

    .line 4
    iput-object p3, p0, Le/f/d/d0/g0/q;->d:Le/f/d/d0/p;

    return-void
.end method


# virtual methods
.method public a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/q;",
            "Le/f/d/e0/a<",
            "TT;>;)",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 4
    invoke-virtual {p2}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 6
    :cond_0
    iget-object v1, p0, Le/f/d/d0/g0/q;->b:Le/f/d/d0/n;

    invoke-virtual {v1, p2}, Le/f/d/d0/n;->a(Le/f/d/e0/a;)Le/f/d/d0/s;

    move-result-object v1

    .line 7
    new-instance v3, Le/f/d/d0/g0/o;

    invoke-virtual {p0, p1, p2, v0}, Le/f/d/d0/g0/q;->a(Le/f/d/q;Le/f/d/e0/a;Ljava/lang/Class;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v3, p0, v1, p1, v2}, Le/f/d/d0/g0/o;-><init>(Le/f/d/d0/g0/q;Le/f/d/d0/s;Ljava/util/Map;Le/f/d/d0/g0/n;)V

    return-object v3
.end method

.method public final a(Le/f/d/q;Ljava/lang/reflect/Field;Ljava/lang/String;Le/f/d/e0/a;ZZ)Le/f/d/d0/g0/p;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/q;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/String;",
            "Le/f/d/e0/a<",
            "*>;ZZ)",
            "Le/f/d/d0/g0/p;"
        }
    .end annotation

    .line 8
    invoke-virtual {p4}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Le/f/d/d0/t;->a(Ljava/lang/reflect/Type;)Z

    move-result v9

    .line 9
    new-instance v0, Le/f/d/d0/g0/n;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p3

    move v4, p5

    move/from16 v5, p6

    move-object v6, p1

    move-object v7, p4

    move-object v8, p2

    invoke-direct/range {v1 .. v9}, Le/f/d/d0/g0/n;-><init>(Le/f/d/d0/g0/q;Ljava/lang/String;ZZLe/f/d/q;Le/f/d/e0/a;Ljava/lang/reflect/Field;Z)V

    return-object v0
.end method

.method public final a(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 1

    .line 2
    const-class v0, Le/f/d/c0/b;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Le/f/d/c0/b;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/f/d/d0/g0/q;->c:Le/f/d/i;

    invoke-interface {v0, p1}, Le/f/d/i;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Le/f/d/c0/b;->value()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final a(Le/f/d/q;Le/f/d/e0/a;Ljava/lang/Class;)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/q;",
            "Le/f/d/e0/a<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/f/d/d0/g0/p;",
            ">;"
        }
    .end annotation

    move-object/from16 v7, p0

    .line 10
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v8

    .line 12
    :cond_0
    invoke-virtual/range {p2 .. p2}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;

    move-result-object v9

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    .line 13
    :goto_0
    const-class v0, Ljava/lang/Object;

    if-eq v11, v0, :cond_4

    .line 14
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v12

    .line 15
    array-length v13, v12

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_3

    aget-object v2, v12, v15

    const/4 v0, 0x1

    .line 16
    invoke-virtual {v7, v2, v0}, Le/f/d/d0/g0/q;->a(Ljava/lang/reflect/Field;Z)Z

    move-result v5

    .line 17
    invoke-virtual {v7, v2, v14}, Le/f/d/d0/g0/q;->a(Ljava/lang/reflect/Field;Z)Z

    move-result v6

    if-nez v5, :cond_1

    if-nez v6, :cond_1

    goto :goto_2

    .line 18
    :cond_1
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 19
    invoke-virtual {v10}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v11, v1}, Le/f/d/d0/e;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 20
    invoke-virtual {v7, v2}, Le/f/d/d0/g0/q;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v6}, Le/f/d/d0/g0/q;->a(Le/f/d/q;Ljava/lang/reflect/Field;Ljava/lang/String;Le/f/d/e0/a;ZZ)Le/f/d/d0/g0/p;

    move-result-object v0

    .line 21
    iget-object v1, v0, Le/f/d/d0/g0/p;->a:Ljava/lang/String;

    invoke-interface {v8, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/d/d0/g0/p;

    if-nez v0, :cond_2

    :goto_2
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 22
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " declares multiple JSON fields named "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Le/f/d/d0/g0/p;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 23
    :cond_3
    invoke-virtual {v10}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v11}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v11, v1}, Le/f/d/d0/e;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object v10

    .line 24
    invoke-virtual {v10}, Le/f/d/e0/a;->a()Ljava/lang/Class;

    move-result-object v11

    goto :goto_0

    :cond_4
    return-object v8
.end method

.method public a(Ljava/lang/reflect/Field;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/d/d0/g0/q;->d:Le/f/d/d0/p;

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Le/f/d/d0/p;->a(Ljava/lang/Class;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Le/f/d/d0/g0/q;->d:Le/f/d/d0/p;

    invoke-virtual {v0, p1, p2}, Le/f/d/d0/p;->a(Ljava/lang/reflect/Field;Z)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
