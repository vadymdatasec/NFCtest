.class public Le/c/a/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le/c/a/e;

.field public b:Z


# direct methods
.method public constructor <init>(Le/c/a/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/c/a/j;->a:Le/c/a/e;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Le/c/a/j;->b:Z

    .line 4
    iput-object p1, p0, Le/c/a/j;->a:Le/c/a/e;

    return-void
.end method

.method public static a(Ljava/util/List;ILe/c/a/f1;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/c/a/d1;",
            ">;I",
            "Le/c/a/f1;",
            ")I"
        }
    .end annotation

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    .line 76
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p2, Le/c/a/h1;->b:Le/c/a/d1;

    if-eq p0, p1, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    .line 77
    invoke-interface {p1}, Le/c/a/d1;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/h1;

    if-ne v1, p2, :cond_3

    return p0

    :cond_3
    add-int/lit8 p0, p0, 0x1

    goto :goto_0
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 10
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "AndroidSVG CSSParser"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static a(Le/c/a/h;ILjava/util/List;I)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/c/a/h;",
            "I",
            "Ljava/util/List<",
            "Le/c/a/d1;",
            ">;I)Z"
        }
    .end annotation

    .line 66
    invoke-virtual {p0, p1}, Le/c/a/h;->a(I)Le/c/a/i;

    move-result-object v0

    .line 67
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/f1;

    .line 68
    invoke-static {v0, p2, p3, v1}, Le/c/a/j;->a(Le/c/a/i;Ljava/util/List;ILe/c/a/f1;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    .line 69
    :cond_0
    iget-object v0, v0, Le/c/a/i;->a:Le/c/a/d;

    sget-object v2, Le/c/a/d;->b:Le/c/a/d;

    const/4 v4, 0x1

    if-ne v0, v2, :cond_3

    if-nez p1, :cond_1

    return v4

    :cond_1
    if-gtz p3, :cond_2

    return v3

    :cond_2
    add-int/lit8 v0, p1, -0x1

    add-int/lit8 p3, p3, -0x1

    .line 70
    invoke-static {p0, v0, p2, p3}, Le/c/a/j;->a(Le/c/a/h;ILjava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_1

    return v4

    .line 71
    :cond_3
    sget-object v2, Le/c/a/d;->c:Le/c/a/d;

    if-ne v0, v2, :cond_4

    sub-int/2addr p1, v4

    sub-int/2addr p3, v4

    .line 72
    invoke-static {p0, p1, p2, p3}, Le/c/a/j;->a(Le/c/a/h;ILjava/util/List;I)Z

    move-result p0

    return p0

    .line 73
    :cond_4
    invoke-static {p2, p3, v1}, Le/c/a/j;->a(Ljava/util/List;ILe/c/a/f1;)I

    move-result v0

    if-gtz v0, :cond_5

    return v3

    .line 74
    :cond_5
    iget-object v1, v1, Le/c/a/h1;->b:Le/c/a/d1;

    invoke-interface {v1}, Le/c/a/d1;->e()Ljava/util/List;

    move-result-object v1

    sub-int/2addr v0, v4

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/f1;

    sub-int/2addr p1, v4

    .line 75
    invoke-static {p0, p1, p2, p3, v0}, Le/c/a/j;->a(Le/c/a/h;ILjava/util/List;ILe/c/a/f1;)Z

    move-result p0

    return p0
.end method

.method public static a(Le/c/a/h;ILjava/util/List;ILe/c/a/f1;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/c/a/h;",
            "I",
            "Ljava/util/List<",
            "Le/c/a/d1;",
            ">;I",
            "Le/c/a/f1;",
            ")Z"
        }
    .end annotation

    .line 57
    invoke-virtual {p0, p1}, Le/c/a/h;->a(I)Le/c/a/i;

    move-result-object v0

    .line 58
    invoke-static {v0, p2, p3, p4}, Le/c/a/j;->a(Le/c/a/i;Ljava/util/List;ILe/c/a/f1;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 59
    :cond_0
    iget-object v0, v0, Le/c/a/i;->a:Le/c/a/d;

    sget-object v1, Le/c/a/d;->b:Le/c/a/d;

    const/4 v3, 0x1

    if-ne v0, v1, :cond_4

    if-nez p1, :cond_1

    return v3

    :cond_1
    :goto_0
    if-gez p3, :cond_2

    return v2

    :cond_2
    add-int/lit8 p4, p1, -0x1

    .line 60
    invoke-static {p0, p4, p2, p3}, Le/c/a/j;->a(Le/c/a/h;ILjava/util/List;I)Z

    move-result p4

    if-eqz p4, :cond_3

    return v3

    :cond_3
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 61
    :cond_4
    sget-object v1, Le/c/a/d;->c:Le/c/a/d;

    if-ne v0, v1, :cond_5

    sub-int/2addr p1, v3

    .line 62
    invoke-static {p0, p1, p2, p3}, Le/c/a/j;->a(Le/c/a/h;ILjava/util/List;I)Z

    move-result p0

    return p0

    .line 63
    :cond_5
    invoke-static {p2, p3, p4}, Le/c/a/j;->a(Ljava/util/List;ILe/c/a/f1;)I

    move-result v0

    if-gtz v0, :cond_6

    return v2

    .line 64
    :cond_6
    iget-object p4, p4, Le/c/a/h1;->b:Le/c/a/d1;

    invoke-interface {p4}, Le/c/a/d1;->e()Ljava/util/List;

    move-result-object p4

    sub-int/2addr v0, v3

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Le/c/a/f1;

    sub-int/2addr p1, v3

    .line 65
    invoke-static {p0, p1, p2, p3, p4}, Le/c/a/j;->a(Le/c/a/h;ILjava/util/List;ILe/c/a/f1;)Z

    move-result p0

    return p0
.end method

.method public static a(Le/c/a/h;Le/c/a/f1;)Z
    .locals 5

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    iget-object v1, p1, Le/c/a/h1;->b:Le/c/a/d1;

    :goto_0
    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 51
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    .line 52
    invoke-virtual {p0}, Le/c/a/h;->e()I

    move-result v4

    if-ne v4, v3, :cond_0

    .line 53
    invoke-virtual {p0, v2}, Le/c/a/h;->a(I)Le/c/a/i;

    move-result-object p0

    invoke-static {p0, v0, v1, p1}, Le/c/a/j;->a(Le/c/a/i;Ljava/util/List;ILe/c/a/f1;)Z

    move-result p0

    return p0

    .line 54
    :cond_0
    invoke-virtual {p0}, Le/c/a/h;->e()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-static {p0, v2, v0, v1, p1}, Le/c/a/j;->a(Le/c/a/h;ILjava/util/List;ILe/c/a/f1;)Z

    move-result p0

    return p0

    .line 55
    :cond_1
    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 56
    check-cast v1, Le/c/a/h1;

    iget-object v1, v1, Le/c/a/h1;->b:Le/c/a/d1;

    goto :goto_0
.end method

.method public static a(Le/c/a/i;Ljava/util/List;ILe/c/a/f1;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/c/a/i;",
            "Ljava/util/List<",
            "Le/c/a/d1;",
            ">;I",
            "Le/c/a/f1;",
            ")Z"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Le/c/a/i;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "G"

    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    instance-of v0, p3, Le/c/a/y;

    if-nez v0, :cond_1

    return v1

    .line 81
    :cond_0
    iget-object v0, p0, Le/c/a/i;->b:Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 82
    :cond_1
    iget-object v0, p0, Le/c/a/i;->c:Ljava/util/List;

    if-eqz v0, :cond_7

    .line 83
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/c/a/a;

    .line 84
    iget-object v3, v2, Le/c/a/a;->a:Ljava/lang/String;

    const-string v4, "id"

    if-ne v3, v4, :cond_4

    .line 85
    iget-object v2, v2, Le/c/a/a;->c:Ljava/lang/String;

    iget-object v3, p3, Le/c/a/f1;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_4
    const-string v4, "class"

    if-ne v3, v4, :cond_6

    .line 86
    iget-object v3, p3, Le/c/a/f1;->g:Ljava/util/List;

    if-nez v3, :cond_5

    return v1

    .line 87
    :cond_5
    iget-object v2, v2, Le/c/a/a;->c:Ljava/lang/String;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_6
    return v1

    .line 88
    :cond_7
    :goto_0
    iget-object p0, p0, Le/c/a/i;->d:Ljava/util/List;

    if-eqz p0, :cond_b

    .line 89
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "first-child"

    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 91
    invoke-static {p1, p2, p3}, Le/c/a/j;->a(Ljava/util/List;ILe/c/a/f1;)I

    move-result v0

    if-eqz v0, :cond_8

    :cond_a
    return v1

    :cond_b
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static a(Ljava/lang/String;Le/c/a/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 4
    new-instance v0, Le/c/a/c;

    invoke-direct {v0, p0}, Le/c/a/c;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 6
    invoke-static {v0}, Le/c/a/j;->e(Le/c/a/c;)Ljava/util/List;

    move-result-object p0

    .line 7
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {p0, p1}, Le/c/a/j;->a(Ljava/util/List;Le/c/a/e;)Z

    move-result p0

    return p0

    .line 9
    :cond_0
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string p1, "Invalid @media type list"

    invoke-direct {p0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Ljava/util/List;Le/c/a/e;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/c/a/e;",
            ">;",
            "Le/c/a/e;",
            ")Z"
        }
    .end annotation

    .line 11
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/e;

    .line 12
    sget-object v1, Le/c/a/e;->b:Le/c/a/e;

    if-eq v0, v1, :cond_2

    if-ne v0, p1, :cond_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static b(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 17
    new-instance v0, Le/c/a/c;

    invoke-direct {v0, p0}, Le/c/a/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {v0}, Le/c/a/o2;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 19
    :cond_0
    invoke-virtual {v0}, Le/c/a/c;->s()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    goto :goto_0

    .line 23
    :cond_2
    new-instance v0, Lorg/xml/sax/SAXException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid value for \"class\" attribute: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(Le/c/a/c;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/c/a/c;",
            ")",
            "Ljava/util/List<",
            "Le/c/a/e;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    :cond_0
    invoke-virtual {p0}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x2c

    .line 3
    invoke-virtual {p0, v1}, Le/c/a/o2;->b(C)Ljava/lang/String;

    move-result-object v1

    .line 4
    :try_start_0
    invoke-static {v1}, Le/c/a/e;->valueOf(Ljava/lang/String;)Le/c/a/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    invoke-virtual {p0}, Le/c/a/o2;->p()Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    .line 6
    :catch_0
    new-instance p0, Lorg/xml/sax/SAXException;

    const-string v0, "Invalid @media type list"

    invoke-direct {p0, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Le/c/a/g;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/c/a/c;

    invoke-direct {v0, p1}, Le/c/a/c;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Le/c/a/o2;->q()V

    .line 3
    invoke-virtual {p0, v0}, Le/c/a/j;->b(Le/c/a/c;)Le/c/a/g;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/c/a/c;)Le/c/a/y0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 31
    new-instance v0, Le/c/a/y0;

    invoke-direct {v0}, Le/c/a/y0;-><init>()V

    .line 32
    :goto_0
    invoke-virtual {p1}, Le/c/a/c;->s()Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-virtual {p1}, Le/c/a/o2;->q()V

    const/16 v2, 0x3a

    .line 34
    invoke-virtual {p1, v2}, Le/c/a/o2;->a(C)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 35
    invoke-virtual {p1}, Le/c/a/o2;->q()V

    .line 36
    invoke-virtual {p1}, Le/c/a/c;->t()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 37
    invoke-virtual {p1}, Le/c/a/o2;->q()V

    const/16 v3, 0x21

    .line 38
    invoke-virtual {p1, v3}, Le/c/a/o2;->a(C)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 39
    invoke-virtual {p1}, Le/c/a/o2;->q()V

    const-string v3, "important"

    .line 40
    invoke-virtual {p1, v3}, Le/c/a/o2;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 41
    invoke-virtual {p1}, Le/c/a/o2;->q()V

    goto :goto_1

    .line 42
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Malformed rule set in <style> element: found unexpected \'!\'"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    const/16 v3, 0x3b

    .line 43
    invoke-virtual {p1, v3}, Le/c/a/o2;->a(C)Z

    .line 44
    invoke-static {v0, v1, v2}, Le/c/a/p2;->a(Le/c/a/y0;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    invoke-virtual {p1}, Le/c/a/o2;->q()V

    const/16 v1, 0x7d

    .line 46
    invoke-virtual {p1, v1}, Le/c/a/o2;->a(C)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 47
    :cond_2
    invoke-virtual {p1}, Le/c/a/o2;->c()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    .line 48
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string v0, "Malformed rule set in <style> element"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Le/c/a/g;Le/c/a/c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 13
    invoke-virtual {p2}, Le/c/a/c;->s()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {p2}, Le/c/a/o2;->q()V

    if-eqz v0, :cond_4

    .line 15
    iget-boolean v1, p0, Le/c/a/j;->b:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    const-string v1, "media"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 16
    invoke-static {p2}, Le/c/a/j;->e(Le/c/a/c;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x7b

    .line 17
    invoke-virtual {p2, v1}, Le/c/a/o2;->a(C)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 18
    invoke-virtual {p2}, Le/c/a/o2;->q()V

    .line 19
    iget-object v1, p0, Le/c/a/j;->a:Le/c/a/e;

    invoke-static {v0, v1}, Le/c/a/j;->a(Ljava/util/List;Le/c/a/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    iput-boolean v3, p0, Le/c/a/j;->b:Z

    .line 21
    invoke-virtual {p0, p2}, Le/c/a/j;->b(Le/c/a/c;)Le/c/a/g;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/c/a/g;->a(Le/c/a/g;)V

    .line 22
    iput-boolean v2, p0, Le/c/a/j;->b:Z

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, p2}, Le/c/a/j;->b(Le/c/a/c;)Le/c/a/g;

    :goto_0
    const/16 p1, 0x7d

    .line 24
    invoke-virtual {p2, p1}, Le/c/a/o2;->a(C)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 25
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid @media rule: expected \'}\' at end of rule set"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid @media rule: missing rule set"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-array p1, v3, [Ljava/lang/Object;

    aput-object v0, p1, v2

    const-string v0, "Ignoring @%s rule"

    .line 27
    invoke-static {v0, p1}, Le/c/a/j;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    invoke-virtual {p0, p2}, Le/c/a/j;->d(Le/c/a/c;)V

    .line 29
    :goto_1
    invoke-virtual {p2}, Le/c/a/o2;->q()V

    return-void

    .line 30
    :cond_4
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Invalid \'@\' rule in <style> element"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Le/c/a/c;)Le/c/a/g;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/c/a/g;

    invoke-direct {v0}, Le/c/a/g;-><init>()V

    .line 2
    :goto_0
    invoke-virtual {p1}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "<!--"

    .line 3
    invoke-virtual {p1, v1}, Le/c/a/o2;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "-->"

    .line 4
    invoke-virtual {p1, v1}, Le/c/a/o2;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0x40

    .line 5
    invoke-virtual {p1, v1}, Le/c/a/o2;->a(C)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 6
    invoke-virtual {p0, v0, p1}, Le/c/a/j;->a(Le/c/a/g;Le/c/a/c;)V

    goto :goto_0

    .line 7
    :cond_3
    invoke-virtual {p0, v0, p1}, Le/c/a/j;->b(Le/c/a/g;Le/c/a/c;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method public final b(Le/c/a/g;Le/c/a/c;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p2}, Le/c/a/j;->c(Le/c/a/c;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/16 v1, 0x7b

    .line 10
    invoke-virtual {p2, v1}, Le/c/a/o2;->a(C)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11
    invoke-virtual {p2}, Le/c/a/o2;->q()V

    .line 12
    invoke-virtual {p0, p2}, Le/c/a/j;->a(Le/c/a/c;)Le/c/a/y0;

    move-result-object v1

    .line 13
    invoke-virtual {p2}, Le/c/a/o2;->q()V

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h;

    .line 15
    new-instance v2, Le/c/a/f;

    invoke-direct {v2, v0, v1}, Le/c/a/f;-><init>(Le/c/a/h;Le/c/a/y0;)V

    invoke-virtual {p1, v2}, Le/c/a/g;->a(Le/c/a/f;)V

    goto :goto_0

    .line 16
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXException;

    const-string p2, "Malformed rule block in <style> element: missing \'{\'"

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Le/c/a/c;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/c/a/c;",
            ")",
            "Ljava/util/List<",
            "Le/c/a/h;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/c/a/o2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    new-instance v1, Le/c/a/h;

    invoke-direct {v1}, Le/c/a/h;-><init>()V

    .line 4
    :goto_0
    invoke-virtual {p1}, Le/c/a/o2;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p1, v1}, Le/c/a/c;->a(Le/c/a/h;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 6
    invoke-virtual {p1}, Le/c/a/o2;->p()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    new-instance v1, Le/c/a/h;

    invoke-direct {v1}, Le/c/a/h;-><init>()V

    goto :goto_0

    .line 9
    :cond_3
    :goto_1
    invoke-virtual {v1}, Le/c/a/h;->d()Z

    move-result p1

    if-nez p1, :cond_4

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method

.method public final d(Le/c/a/c;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p1}, Le/c/a/o2;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p1}, Le/c/a/o2;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x3b

    if-ne v1, v2, :cond_2

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/16 v2, 0x7b

    if-ne v1, v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/16 v2, 0x7d

    if-ne v1, v2, :cond_0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_0

    return-void
.end method
