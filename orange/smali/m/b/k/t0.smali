.class public Lm/b/k/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;

.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;


# instance fields
.field public a:Lm/b/j/r0;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/b/k/q0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const-string v0, ","

    const-string v1, ">"

    const-string v2, "+"

    const-string v3, "~"

    const-string v4, " "

    .line 1
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/k/t0;->d:[Ljava/lang/String;

    const-string v1, "="

    const-string v2, "!="

    const-string v3, "^="

    const-string v4, "$="

    const-string v5, "*="

    const-string v6, "~="

    .line 2
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm/b/k/t0;->e:[Ljava/lang/String;

    const-string v0, "((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?"

    const/4 v1, 0x2

    .line 3
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lm/b/k/t0;->f:Ljava/util/regex/Pattern;

    const-string v0, "(\\+|-)?(\\d+)"

    .line 4
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lm/b/k/t0;->g:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    .line 3
    iput-object p1, p0, Lm/b/k/t0;->b:Ljava/lang/String;

    .line 4
    new-instance v0, Lm/b/j/r0;

    invoke-direct {v0, p1}, Lm/b/j/r0;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lm/b/k/q0;
    .locals 1

    .line 1
    new-instance v0, Lm/b/k/t0;

    invoke-direct {v0, p0}, Lm/b/k/t0;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lm/b/k/t0;->o()Lm/b/k/q0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 25
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/g;

    invoke-direct {v1}, Lm/b/k/g;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(C)V
    .locals 10

    .line 3
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->d()Z

    .line 4
    invoke-virtual {p0}, Lm/b/k/t0;->g()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lm/b/k/t0;->a(Ljava/lang/String;)Lm/b/k/q0;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x2c

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v3, :cond_0

    .line 7
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/k/q0;

    .line 8
    instance-of v5, v1, Lm/b/k/d;

    if-eqz v5, :cond_1

    if-eq p1, v2, :cond_1

    .line 9
    move-object v5, v1

    check-cast v5, Lm/b/k/d;

    invoke-virtual {v5}, Lm/b/k/e;->a()Lm/b/k/q0;

    move-result-object v5

    const/4 v6, 0x1

    move-object v9, v5

    move-object v5, v1

    move-object v1, v9

    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Lm/b/k/c;

    iget-object v5, p0, Lm/b/k/t0;->c:Ljava/util/List;

    invoke-direct {v1, v5}, Lm/b/k/c;-><init>(Ljava/util/Collection;)V

    :cond_1
    move-object v5, v1

    const/4 v6, 0x0

    .line 11
    :goto_0
    iget-object v7, p0, Lm/b/k/t0;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->clear()V

    const/16 v7, 0x3e

    const/4 v8, 0x2

    if-ne p1, v7, :cond_2

    .line 12
    new-instance p1, Lm/b/k/c;

    new-array v2, v8, [Lm/b/k/q0;

    aput-object v0, v2, v4

    new-instance v0, Lm/b/k/v0;

    invoke-direct {v0, v1}, Lm/b/k/v0;-><init>(Lm/b/k/q0;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lm/b/k/c;-><init>([Lm/b/k/q0;)V

    goto :goto_1

    :cond_2
    const/16 v7, 0x20

    if-ne p1, v7, :cond_3

    .line 13
    new-instance p1, Lm/b/k/c;

    new-array v2, v8, [Lm/b/k/q0;

    aput-object v0, v2, v4

    new-instance v0, Lm/b/k/y0;

    invoke-direct {v0, v1}, Lm/b/k/y0;-><init>(Lm/b/k/q0;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lm/b/k/c;-><init>([Lm/b/k/q0;)V

    goto :goto_1

    :cond_3
    const/16 v7, 0x2b

    if-ne p1, v7, :cond_4

    .line 14
    new-instance p1, Lm/b/k/c;

    new-array v2, v8, [Lm/b/k/q0;

    aput-object v0, v2, v4

    new-instance v0, Lm/b/k/w0;

    invoke-direct {v0, v1}, Lm/b/k/w0;-><init>(Lm/b/k/q0;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lm/b/k/c;-><init>([Lm/b/k/q0;)V

    goto :goto_1

    :cond_4
    const/16 v7, 0x7e

    if-ne p1, v7, :cond_5

    .line 15
    new-instance p1, Lm/b/k/c;

    new-array v2, v8, [Lm/b/k/q0;

    aput-object v0, v2, v4

    new-instance v0, Lm/b/k/z0;

    invoke-direct {v0, v1}, Lm/b/k/z0;-><init>(Lm/b/k/q0;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lm/b/k/c;-><init>([Lm/b/k/q0;)V

    goto :goto_1

    :cond_5
    if-ne p1, v2, :cond_8

    .line 16
    instance-of p1, v1, Lm/b/k/d;

    if-eqz p1, :cond_6

    .line 17
    check-cast v1, Lm/b/k/d;

    .line 18
    invoke-virtual {v1, v0}, Lm/b/k/d;->b(Lm/b/k/q0;)V

    move-object p1, v1

    goto :goto_1

    .line 19
    :cond_6
    new-instance p1, Lm/b/k/d;

    invoke-direct {p1}, Lm/b/k/d;-><init>()V

    .line 20
    invoke-virtual {p1, v1}, Lm/b/k/d;->b(Lm/b/k/q0;)V

    .line 21
    invoke-virtual {p1, v0}, Lm/b/k/d;->b(Lm/b/k/q0;)V

    :goto_1
    if-eqz v6, :cond_7

    .line 22
    move-object v0, v5

    check-cast v0, Lm/b/k/d;

    invoke-virtual {v0, p1}, Lm/b/k/e;->a(Lm/b/k/q0;)V

    goto :goto_2

    :cond_7
    move-object v5, p1

    .line 23
    :goto_2
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 24
    :cond_8
    new-instance v0, Lorg/jsoup/select/Selector$SelectorParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown combinator: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v4, [Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public final a(Z)V
    .locals 3

    .line 41
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    if-eqz p1, :cond_0

    const-string v1, ":containsOwn"

    goto :goto_0

    :cond_0
    const-string v1, ":contains"

    :goto_0
    invoke-virtual {v0, v1}, Lm/b/j/r0;->b(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v1, 0x28

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm/b/j/r0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":contains(text) query must not be empty"

    .line 43
    invoke-static {v0, v1}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 44
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/s;

    invoke-direct {v1, v0}, Lm/b/k/s;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 45
    :cond_1
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/t;

    invoke-direct {v1, v0}, Lm/b/k/t;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public final a(ZZ)V
    .locals 8

    .line 26
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 27
    sget-object v1, Lm/b/k/t0;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 28
    sget-object v2, Lm/b/k/t0;->g:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, "odd"

    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const-string v3, "even"

    .line 30
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    const-string v4, ""

    const-string v7, "^\\+"

    if-eqz v3, :cond_4

    const/4 v0, 0x3

    .line 32
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    :goto_0
    const/4 v2, 0x4

    .line 33
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    move v5, v1

    :cond_3
    move v4, v0

    goto :goto_1

    .line 34
    :cond_4
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 35
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v5, v0

    const/4 v4, 0x0

    :goto_1
    if-eqz p2, :cond_6

    if-eqz p1, :cond_5

    .line 36
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance p2, Lm/b/k/h0;

    invoke-direct {p2, v4, v5}, Lm/b/k/h0;-><init>(II)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 37
    :cond_5
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance p2, Lm/b/k/i0;

    invoke-direct {p2, v4, v5}, Lm/b/k/i0;-><init>(II)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    if-eqz p1, :cond_7

    .line 38
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance p2, Lm/b/k/g0;

    invoke-direct {p2, v4, v5}, Lm/b/k/g0;-><init>(II)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 39
    :cond_7
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance p2, Lm/b/k/f0;

    invoke-direct {p2, v4, v5}, Lm/b/k/f0;-><init>(II)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    return-void

    .line 40
    :cond_8
    new-instance p1, Lorg/jsoup/select/Selector$SelectorParseException;

    new-array p2, v6, [Ljava/lang/Object;

    aput-object v0, p2, v5

    const-string v0, "Could not parse nth-index \'%s\': unexpected format"

    invoke-direct {p1, v0, p2}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public final b()V
    .locals 6

    .line 1
    new-instance v0, Lm/b/j/r0;

    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v2, 0x5b

    const/16 v3, 0x5d

    invoke-virtual {v1, v2, v3}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lm/b/j/r0;-><init>(Ljava/lang/String;)V

    .line 2
    sget-object v1, Lm/b/k/t0;->e:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lm/b/j/r0;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lm/b/h/j;->b(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Lm/b/j/r0;->d()Z

    .line 5
    invoke-virtual {v0}, Lm/b/j/r0;->e()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const-string v0, "^"

    .line 6
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/j;

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lm/b/k/j;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/h;

    invoke-direct {v2, v1}, Lm/b/k/h;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1
    const-string v2, "="

    .line 9
    invoke-virtual {v0, v2}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 10
    iget-object v2, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v3, Lm/b/k/k;

    invoke-virtual {v0}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lm/b/k/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_2
    const-string v2, "!="

    .line 11
    invoke-virtual {v0, v2}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 12
    iget-object v2, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v3, Lm/b/k/o;

    invoke-virtual {v0}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lm/b/k/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const-string v2, "^="

    .line 13
    invoke-virtual {v0, v2}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 14
    iget-object v2, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v3, Lm/b/k/p;

    invoke-virtual {v0}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lm/b/k/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    const-string v2, "$="

    .line 15
    invoke-virtual {v0, v2}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 16
    iget-object v2, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v3, Lm/b/k/m;

    invoke-virtual {v0}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lm/b/k/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const-string v2, "*="

    .line 17
    invoke-virtual {v0, v2}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 18
    iget-object v2, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v3, Lm/b/k/l;

    invoke-virtual {v0}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lm/b/k/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    const-string v2, "~="

    .line 19
    invoke-virtual {v0, v2}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 20
    iget-object v2, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v3, Lm/b/k/n;

    invoke-virtual {v0}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lm/b/k/n;-><init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    .line 21
    :cond_7
    new-instance v1, Lorg/jsoup/select/Selector$SelectorParseException;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lm/b/k/t0;->b:Ljava/lang/String;

    aput-object v5, v2, v4

    invoke-virtual {v0}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    const-string v0, "Could not parse attribute query \'%s\': unexpected token at \'%s\'"

    invoke-direct {v1, v0, v2}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1
.end method

.method public final b(Z)V
    .locals 3

    .line 22
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    if-eqz p1, :cond_0

    const-string v1, ":matchesOwn"

    goto :goto_0

    :cond_0
    const-string v1, ":matches"

    :goto_0
    invoke-virtual {v0, v1}, Lm/b/j/r0;->b(Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v1, 0x28

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":matches(regex) query must not be empty"

    .line 24
    invoke-static {v0, v1}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 25
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/n0;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {v1, v0}, Lm/b/k/n0;-><init>(Ljava/util/regex/Pattern;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 26
    :cond_1
    iget-object p1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/m0;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {v1, v0}, Lm/b/k/m0;-><init>(Ljava/util/regex/Pattern;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->b()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lm/b/h/j;->b(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/q;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lm/b/k/q;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->b()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lm/b/h/j;->b(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/v;

    invoke-direct {v2, v0}, Lm/b/k/v;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e()V
    .locals 9

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->c()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lm/b/h/j;->b(Ljava/lang/String;)V

    const-string v1, "*|"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    const-string v3, ":"

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v4, Lm/b/k/d;

    const/4 v5, 0x2

    new-array v5, v5, [Lm/b/k/q0;

    const/4 v6, 0x0

    new-instance v7, Lm/b/k/o0;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lm/b/k/o0;-><init>(Ljava/lang/String;)V

    aput-object v7, v5, v6

    const/4 v6, 0x1

    new-instance v7, Lm/b/k/p0;

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Lm/b/k/p0;-><init>(Ljava/lang/String;)V

    aput-object v7, v5, v6

    invoke-direct {v4, v5}, Lm/b/k/d;-><init>([Lm/b/k/q0;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v1, "|"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 7
    :cond_1
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/o0;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lm/b/k/o0;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public final f()I
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lm/b/h/i;->b(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Index must be numeric"

    invoke-static {v1, v2}, Lm/b/h/j;->b(ZLjava/lang/String;)V

    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    :goto_0
    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v1}, Lm/b/j/r0;->e()Z

    move-result v1

    if-nez v1, :cond_3

    .line 3
    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v2, "("

    invoke-virtual {v1, v2}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v2, 0x28

    const/16 v3, 0x29

    invoke-virtual {v1, v2, v3}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v2, "["

    invoke-virtual {v1, v2}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v2, 0x5b

    const/16 v3, 0x5d

    invoke-virtual {v1, v2, v3}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    sget-object v2, Lm/b/k/t0;->d:[Ljava/lang/String;

    invoke-virtual {v1, v2}, Lm/b/j/r0;->b([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v1}, Lm/b/j/r0;->a()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 9
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":containsData"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->b(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v1, 0x28

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm/b/j/r0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":containsData(text) query must not be empty"

    .line 3
    invoke-static {v0, v1}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/r;

    invoke-direct {v2, v0}, Lm/b/k/r;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, "#"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lm/b/k/t0;->d()V

    goto/16 :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, "."

    invoke-virtual {v0, v1}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lm/b/k/t0;->c()V

    goto/16 :goto_1

    .line 5
    :cond_1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->g()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, "*|"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_0

    .line 6
    :cond_2
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, "["

    invoke-virtual {v0, v1}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p0}, Lm/b/k/t0;->b()V

    goto/16 :goto_1

    .line 8
    :cond_3
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, "*"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {p0}, Lm/b/k/t0;->a()V

    goto/16 :goto_1

    .line 10
    :cond_4
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":lt("

    invoke-virtual {v0, v1}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11
    invoke-virtual {p0}, Lm/b/k/t0;->m()V

    goto/16 :goto_1

    .line 12
    :cond_5
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":gt("

    invoke-virtual {v0, v1}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 13
    invoke-virtual {p0}, Lm/b/k/t0;->l()V

    goto/16 :goto_1

    .line 14
    :cond_6
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":eq("

    invoke-virtual {v0, v1}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 15
    invoke-virtual {p0}, Lm/b/k/t0;->k()V

    goto/16 :goto_1

    .line 16
    :cond_7
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":has("

    invoke-virtual {v0, v1}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 17
    invoke-virtual {p0}, Lm/b/k/t0;->j()V

    goto/16 :goto_1

    .line 18
    :cond_8
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":contains("

    invoke-virtual {v0, v1}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    .line 19
    invoke-virtual {p0, v1}, Lm/b/k/t0;->a(Z)V

    goto/16 :goto_1

    .line 20
    :cond_9
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v2, ":containsOwn("

    invoke-virtual {v0, v2}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_a

    .line 21
    invoke-virtual {p0, v2}, Lm/b/k/t0;->a(Z)V

    goto/16 :goto_1

    .line 22
    :cond_a
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":containsData("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 23
    invoke-virtual {p0}, Lm/b/k/t0;->h()V

    goto/16 :goto_1

    .line 24
    :cond_b
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":matches("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 25
    invoke-virtual {p0, v1}, Lm/b/k/t0;->b(Z)V

    goto/16 :goto_1

    .line 26
    :cond_c
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":matchesOwn("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 27
    invoke-virtual {p0, v2}, Lm/b/k/t0;->b(Z)V

    goto/16 :goto_1

    .line 28
    :cond_d
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":not("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 29
    invoke-virtual {p0}, Lm/b/k/t0;->n()V

    goto/16 :goto_1

    .line 30
    :cond_e
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":nth-child("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 31
    invoke-virtual {p0, v1, v1}, Lm/b/k/t0;->a(ZZ)V

    goto/16 :goto_1

    .line 32
    :cond_f
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":nth-last-child("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 33
    invoke-virtual {p0, v2, v1}, Lm/b/k/t0;->a(ZZ)V

    goto/16 :goto_1

    .line 34
    :cond_10
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":nth-of-type("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 35
    invoke-virtual {p0, v1, v2}, Lm/b/k/t0;->a(ZZ)V

    goto/16 :goto_1

    .line 36
    :cond_11
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":nth-last-of-type("

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 37
    invoke-virtual {p0, v2, v2}, Lm/b/k/t0;->a(ZZ)V

    goto/16 :goto_1

    .line 38
    :cond_12
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":first-child"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 39
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/b0;

    invoke-direct {v1}, Lm/b/k/b0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 40
    :cond_13
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":last-child"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 41
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/d0;

    invoke-direct {v1}, Lm/b/k/d0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 42
    :cond_14
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":first-of-type"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 43
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/c0;

    invoke-direct {v1}, Lm/b/k/c0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 44
    :cond_15
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":last-of-type"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 45
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/e0;

    invoke-direct {v1}, Lm/b/k/e0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 46
    :cond_16
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":only-child"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 47
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/j0;

    invoke-direct {v1}, Lm/b/k/j0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 48
    :cond_17
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":only-of-type"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 49
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/k0;

    invoke-direct {v1}, Lm/b/k/k0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 50
    :cond_18
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":empty"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 51
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/a0;

    invoke-direct {v1}, Lm/b/k/a0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 52
    :cond_19
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v3, ":root"

    invoke-virtual {v0, v3}, Lm/b/j/r0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 53
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/l0;

    invoke-direct {v1}, Lm/b/k/l0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 54
    :cond_1a
    new-instance v0, Lorg/jsoup/select/Selector$SelectorParseException;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lm/b/k/t0;->b:Ljava/lang/String;

    aput-object v4, v3, v1

    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v1}, Lm/b/j/r0;->h()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    const-string v1, "Could not parse query \'%s\': unexpected token at \'%s\'"

    invoke-direct {v0, v1, v3}, Lorg/jsoup/select/Selector$SelectorParseException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    .line 55
    :cond_1b
    :goto_0
    invoke-virtual {p0}, Lm/b/k/t0;->e()V

    :goto_1
    return-void
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":has"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->b(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v1, 0x28

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":has(el) subselect must not be empty"

    .line 3
    invoke-static {v0, v1}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/u0;

    invoke-static {v0}, Lm/b/k/t0;->a(Ljava/lang/String;)Lm/b/k/q0;

    move-result-object v0

    invoke-direct {v2, v0}, Lm/b/k/u0;-><init>(Lm/b/k/q0;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/w;

    invoke-virtual {p0}, Lm/b/k/t0;->f()I

    move-result v2

    invoke-direct {v1, v2}, Lm/b/k/w;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/y;

    invoke-virtual {p0}, Lm/b/k/t0;->f()I

    move-result v2

    invoke-direct {v1, v2}, Lm/b/k/y;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/z;

    invoke-virtual {p0}, Lm/b/k/t0;->f()I

    move-result v2

    invoke-direct {v1, v2}, Lm/b/k/z;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const-string v1, ":not"

    invoke-virtual {v0, v1}, Lm/b/j/r0;->b(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    const/16 v1, 0x28

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Lm/b/j/r0;->a(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":not(selector) subselect must not be empty"

    .line 3
    invoke-static {v0, v1}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v2, Lm/b/k/x0;

    invoke-static {v0}, Lm/b/k/t0;->a(Ljava/lang/String;)Lm/b/k/q0;

    move-result-object v0

    invoke-direct {v2, v0}, Lm/b/k/x0;-><init>(Lm/b/k/q0;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public o()Lm/b/k/q0;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->d()Z

    .line 2
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    sget-object v1, Lm/b/k/t0;->d:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lm/b/j/r0;->b([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    new-instance v1, Lm/b/k/a1;

    invoke-direct {v1}, Lm/b/k/a1;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->a()C

    move-result v0

    invoke-virtual {p0, v0}, Lm/b/k/t0;->a(C)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lm/b/k/t0;->i()V

    .line 6
    :goto_0
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 7
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->d()Z

    move-result v0

    .line 8
    iget-object v1, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    sget-object v2, Lm/b/k/t0;->d:[Ljava/lang/String;

    invoke-virtual {v1, v2}, Lm/b/j/r0;->b([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 9
    iget-object v0, p0, Lm/b/k/t0;->a:Lm/b/j/r0;

    invoke-virtual {v0}, Lm/b/j/r0;->a()C

    move-result v0

    invoke-virtual {p0, v0}, Lm/b/k/t0;->a(C)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const/16 v0, 0x20

    .line 10
    invoke-virtual {p0, v0}, Lm/b/k/t0;->a(C)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p0}, Lm/b/k/t0;->i()V

    goto :goto_0

    .line 12
    :cond_3
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 13
    iget-object v0, p0, Lm/b/k/t0;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/k/q0;

    return-object v0

    .line 14
    :cond_4
    new-instance v0, Lm/b/k/c;

    iget-object v1, p0, Lm/b/k/t0;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Lm/b/k/c;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
