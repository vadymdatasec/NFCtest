.class public Le/h/b/a/p/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Le/h/b/a/m/d;",
        ">;"
    }
.end annotation


# instance fields
.field public b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/b/a/p/f;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/SharedPreferences;)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "isFavorite"

    .line 8
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public a(Le/h/b/a/m/d;Le/h/b/a/m/d;)I
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Le/h/b/a/p/f;->a(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2
    invoke-virtual {p0, p2}, Le/h/b/a/p/f;->a(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Le/h/b/a/p/f;->a(Landroid/content/SharedPreferences;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p0, v1}, Le/h/b/a/p/f;->a(Landroid/content/SharedPreferences;)I

    move-result v2

    .line 5
    :cond_1
    invoke-virtual {p1}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;

    move-result-object v1

    sget-object v3, Le/h/b/a/m/a;->c:Le/h/b/a/m/a;

    if-ne v1, v3, :cond_2

    const/4 p1, -0x1

    return p1

    .line 6
    :cond_2
    invoke-virtual {p2}, Le/h/b/a/m/d;->q()Le/h/b/a/m/a;

    move-result-object v1

    sget-object v3, Le/h/b/a/m/a;->c:Le/h/b/a/m/a;

    if-ne v1, v3, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    if-eq v0, v2, :cond_4

    sub-int/2addr v2, v0

    return v2

    .line 7
    :cond_4
    sget-object v0, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-virtual {p1}, Le/h/b/a/m/d;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Le/h/b/a/m/d;->f()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final a(Le/h/b/a/m/d;)Landroid/content/SharedPreferences;
    .locals 3

    .line 9
    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    iget-object v0, p0, Le/h/b/a/p/f;->b:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Le/h/b/a/m/d;

    check-cast p2, Le/h/b/a/m/d;

    invoke-virtual {p0, p1, p2}, Le/h/b/a/p/f;->a(Le/h/b/a/m/d;Le/h/b/a/m/d;)I

    move-result p1

    return p1
.end method
