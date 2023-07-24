.class public Le/f/c/l/e/n/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/n/a;


# static fields
.field public static final c:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Ljava/io/File;

.field public b:Le/f/c/l/e/n/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    .line 1
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/n/m;->c:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/n/m;->a:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/n/m;->b:Le/f/c/l/e/n/j;

    const-string v1, "There was a problem closing the Crashlytics log file."

    invoke-static {v0, v1}, Le/f/c/l/e/m/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/f/c/l/e/n/m;->b:Le/f/c/l/e/n/j;

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/n/m;->a()V

    .line 2
    iget-object v0, p0, Le/f/c/l/e/n/m;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/n/m;->d()[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/String;

    sget-object v2, Le/f/c/l/e/n/m;->c:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public d()[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/n/m;->e()Le/f/c/l/e/n/l;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget v1, v0, Le/f/c/l/e/n/l;->b:I

    new-array v2, v1, [B

    .line 3
    iget-object v0, v0, Le/f/c/l/e/n/l;->a:[B

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method public final e()Le/f/c/l/e/n/l;
    .locals 6

    .line 1
    iget-object v0, p0, Le/f/c/l/e/n/m;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Le/f/c/l/e/n/m;->f()V

    .line 3
    iget-object v0, p0, Le/f/c/l/e/n/m;->b:Le/f/c/l/e/n/j;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    .line 4
    invoke-virtual {v0}, Le/f/c/l/e/n/j;->l()I

    move-result v0

    new-array v0, v0, [B

    .line 5
    :try_start_0
    iget-object v3, p0, Le/f/c/l/e/n/m;->b:Le/f/c/l/e/n/j;

    new-instance v4, Le/f/c/l/e/n/k;

    invoke-direct {v4, p0, v0, v1}, Le/f/c/l/e/n/k;-><init>(Le/f/c/l/e/n/m;[B[I)V

    invoke-virtual {v3, v4}, Le/f/c/l/e/n/j;->a(Le/f/c/l/e/n/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 6
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    const-string v5, "A problem occurred while reading the Crashlytics log file."

    invoke-virtual {v4, v5, v3}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    :goto_0
    new-instance v3, Le/f/c/l/e/n/l;

    aget v1, v1, v2

    invoke-direct {v3, p0, v0, v1}, Le/f/c/l/e/n/l;-><init>(Le/f/c/l/e/n/m;[BI)V

    return-object v3
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/c/l/e/n/m;->b:Le/f/c/l/e/n/j;

    if-nez v0, :cond_0

    .line 2
    :try_start_0
    new-instance v0, Le/f/c/l/e/n/j;

    iget-object v1, p0, Le/f/c/l/e/n/m;->a:Ljava/io/File;

    invoke-direct {v0, v1}, Le/f/c/l/e/n/j;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Le/f/c/l/e/n/m;->b:Le/f/c/l/e/n/j;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not open log file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Le/f/c/l/e/n/m;->a:Ljava/io/File;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
