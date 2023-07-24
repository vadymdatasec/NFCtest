.class public Le/h/d/a/a/s/q;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# instance fields
.field public final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "nfcoffice"

    const/16 v1, 0x1d

    .line 1
    invoke-direct {p0, p1, v0, v1}, Le/h/d/a/a/s/q;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 3
    iput-object p1, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/h/d/a/a/s/k0/d;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-virtual {p1, v0}, Le/h/d/a/a/s/k0/d;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_1

    .line 4
    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
.end method

.method public b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/h/d/a/a/s/k0/d;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-virtual {p1, v0}, Le/h/d/a/a/s/k0/d;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_1

    .line 4
    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "packid.SQLiteHelper"

    const-string v1, "onCreate"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p1}, Le/h/d/a/a/s/c0;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 3
    invoke-static {p1}, Le/h/d/a/a/s/g0;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 4
    new-instance v0, Le/h/d/a/a/s/e0;

    iget-object v1, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Le/h/d/a/a/s/e0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v0}, Le/h/d/a/a/s/e0;->a()V

    .line 5
    new-instance v0, Le/h/d/a/a/s/n;

    iget-object v1, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Le/h/d/a/a/s/n;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v0}, Le/h/d/a/a/s/n;->a()V

    .line 6
    new-instance v0, Le/h/d/a/a/s/h;

    iget-object v1, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Le/h/d/a/a/s/h;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v0}, Le/h/d/a/a/s/h;->a()V

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onUpgrade from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "packid.SQLiteHelper"

    invoke-static {v0, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p3, 0x2

    if-ge p2, p3, :cond_0

    .line 2
    invoke-static {p1}, Le/h/d/a/a/s/g0;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ge p2, v0, :cond_1

    .line 3
    invoke-static {p1}, Le/h/d/a/a/s/g0;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_1
    :goto_0
    const/4 v0, 0x4

    if-ge p2, v0, :cond_2

    .line 4
    new-instance v0, Le/h/d/a/a/s/b0;

    iget-object v1, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Le/h/d/a/a/s/b0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v0}, Le/h/d/a/a/s/b0;->a()V

    :cond_2
    const/4 v0, 0x5

    if-ge p2, v0, :cond_3

    .line 5
    new-instance v0, Le/h/d/a/a/s/n0;

    iget-object v1, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Le/h/d/a/a/s/n0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v0}, Le/h/d/a/a/s/n0;->a()V

    :cond_3
    if-ge p2, p3, :cond_4

    .line 6
    new-instance p3, Le/h/d/a/a/s/e0;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/e0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/e0;->a()V

    :cond_4
    const/4 p3, 0x6

    if-ge p2, p3, :cond_5

    .line 7
    new-instance p3, Le/h/d/a/a/s/m0;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/m0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/m0;->a()V

    :cond_5
    const/4 p3, 0x7

    if-ge p2, p3, :cond_6

    .line 8
    new-instance p3, Le/h/d/a/a/s/l0;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/l0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/l0;->a()V

    :cond_6
    const/16 p3, 0x8

    if-ge p2, p3, :cond_7

    .line 9
    new-instance p3, Le/h/d/a/a/s/o;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/o;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/o;->a()V

    :cond_7
    const/16 p3, 0x9

    if-ge p2, p3, :cond_8

    .line 10
    new-instance p3, Le/h/d/a/a/s/f0;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/f0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/f0;->a()V

    :cond_8
    const/16 p3, 0xa

    if-ge p2, p3, :cond_9

    .line 11
    new-instance p3, Le/h/d/a/a/s/e;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/e;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/e;->a()V

    :cond_9
    const/16 p3, 0xb

    if-ge p2, p3, :cond_a

    .line 12
    new-instance p3, Le/h/d/a/a/s/t;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/t;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/t;->a()V

    :cond_a
    const/16 p3, 0xc

    if-ge p2, p3, :cond_b

    .line 13
    new-instance p3, Le/h/d/a/a/s/w;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/w;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/w;->a()V

    :cond_b
    const/16 p3, 0xd

    if-ge p2, p3, :cond_c

    .line 14
    new-instance p3, Le/h/d/a/a/s/k;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/k;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/k;->a()V

    :cond_c
    const/16 p3, 0xe

    if-ge p2, p3, :cond_d

    .line 15
    new-instance p3, Le/h/d/a/a/s/g;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/g;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/g;->a()V

    :cond_d
    const/16 p3, 0xf

    if-ge p2, p3, :cond_e

    .line 16
    new-instance p3, Le/h/d/a/a/s/i;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/i;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/i;->a()V

    :cond_e
    const/16 p3, 0x10

    if-ge p2, p3, :cond_f

    .line 17
    new-instance p3, Le/h/d/a/a/s/u;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/u;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/u;->a()V

    :cond_f
    const/16 p3, 0x11

    if-ge p2, p3, :cond_10

    .line 18
    new-instance p3, Le/h/d/a/a/s/d0;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/d0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/d0;->a()V

    :cond_10
    const/16 p3, 0x12

    if-ge p2, p3, :cond_11

    .line 19
    new-instance p3, Le/h/d/a/a/s/d;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/d;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/d;->a()V

    :cond_11
    const/16 p3, 0x13

    if-ge p2, p3, :cond_12

    .line 20
    new-instance p3, Le/h/d/a/a/s/o0;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/o0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/o0;->a()V

    :cond_12
    const/16 p3, 0x14

    if-ge p2, p3, :cond_13

    .line 21
    new-instance p3, Le/h/d/a/a/s/p;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/p;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/p;->a()V

    :cond_13
    const/16 p3, 0x15

    if-ge p2, p3, :cond_14

    .line 22
    new-instance p3, Le/h/d/a/a/s/j0;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/j0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/j0;->a()V

    :cond_14
    const/16 p3, 0x16

    if-ge p2, p3, :cond_15

    .line 23
    new-instance p3, Le/h/d/a/a/s/s;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/s;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/s;->a()V

    :cond_15
    const/16 p3, 0x17

    if-ge p2, p3, :cond_16

    .line 24
    new-instance p3, Le/h/d/a/a/s/n;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/n;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/n;->a()V

    :cond_16
    const/16 p3, 0x19

    if-ge p2, p3, :cond_17

    .line 25
    new-instance p3, Le/h/d/a/a/s/b;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/b;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/b;->a()V

    :cond_17
    const/16 p3, 0x1a

    if-ge p2, p3, :cond_18

    .line 26
    new-instance p3, Le/h/d/a/a/s/j;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/j;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/j;->a()V

    :cond_18
    const/16 p3, 0x1b

    if-ge p2, p3, :cond_19

    .line 27
    new-instance p3, Le/h/d/a/a/s/f;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/f;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/f;->a()V

    :cond_19
    const/16 p3, 0x1c

    if-ge p2, p3, :cond_1a

    .line 28
    new-instance p3, Le/h/d/a/a/s/h;

    iget-object v0, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p3, v0, p1}, Le/h/d/a/a/s/h;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p3}, Le/h/d/a/a/s/h;->a()V

    :cond_1a
    const/16 p3, 0x1d

    if-ge p2, p3, :cond_1b

    .line 29
    new-instance p2, Le/h/d/a/a/s/l;

    iget-object p3, p0, Le/h/d/a/a/s/q;->b:Landroid/content/Context;

    invoke-direct {p2, p3, p1}, Le/h/d/a/a/s/l;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {p2}, Le/h/d/a/a/s/l;->a()V

    :cond_1b
    return-void
.end method
