.class public Le/f/c/l/e/t/h/e;
.super Le/f/c/l/e/m/a;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/t/h/c;


# instance fields
.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/q/a;->c:Le/f/c/l/e/q/a;

    invoke-direct {p0, p1, p2, p3, v0}, Le/f/c/l/e/m/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;)V

    .line 2
    iput-object p4, p0, Le/f/c/l/e/t/h/e;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Le/f/c/l/e/q/b;Ljava/lang/String;)Le/f/c/l/e/q/b;
    .locals 2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Crashlytics Android SDK/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-static {}, Le/f/c/l/e/m/b1;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "User-Agent"

    .line 13
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    const-string v0, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v1, "android"

    .line 14
    invoke-virtual {p1, v0, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object v0, p0, Le/f/c/l/e/t/h/e;->f:Ljava/lang/String;

    const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"

    .line 15
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    const-string v0, "X-CRASHLYTICS-GOOGLE-APP-ID"

    .line 16
    invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    return-object p1
.end method

.method public final a(Le/f/c/l/e/q/b;Ljava/lang/String;Le/f/c/l/e/t/g/d;)Le/f/c/l/e/q/b;
    .locals 5

    if-eqz p2, :cond_0

    const-string v0, "org_id"

    .line 17
    invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    .line 18
    :cond_0
    invoke-interface {p3}, Le/f/c/l/e/t/g/d;->d()Ljava/lang/String;

    move-result-object p2

    const-string v0, "report_id"

    invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    .line 19
    invoke-interface {p3}, Le/f/c/l/e/t/g/d;->b()[Ljava/io/File;

    move-result-object p2

    array-length p3, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_b

    aget-object v1, p2, v0

    .line 20
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "minidump"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "application/octet-stream"

    if-eqz v2, :cond_1

    .line 21
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "minidump_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto/16 :goto_1

    .line 22
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "metadata"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 23
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "crash_meta_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto/16 :goto_1

    .line 24
    :cond_2
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "binaryImages"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 25
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "binary_images_file"

    .line 26
    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto/16 :goto_1

    .line 27
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "session"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "session_meta_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto/16 :goto_1

    .line 29
    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "app"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 30
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "app_meta_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto :goto_1

    .line 31
    :cond_5
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "device"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 32
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "device_meta_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto :goto_1

    .line 33
    :cond_6
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "os"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 34
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "os_meta_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto :goto_1

    .line 35
    :cond_7
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "user"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 36
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "user_meta_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto :goto_1

    .line 37
    :cond_8
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "logs"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 38
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "logs_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    goto :goto_1

    .line 39
    :cond_9
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "keys"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 40
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "keys_file"

    invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;

    :cond_a
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_b
    return-object p1
.end method

.method public a(Le/f/c/l/e/t/g/a;Z)Z
    .locals 2

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/a;->a()Le/f/c/l/e/q/b;

    move-result-object p2

    .line 2
    iget-object v0, p1, Le/f/c/l/e/t/g/a;->b:Ljava/lang/String;

    invoke-virtual {p0, p2, v0}, Le/f/c/l/e/t/h/e;->a(Le/f/c/l/e/q/b;Ljava/lang/String;)Le/f/c/l/e/q/b;

    .line 3
    iget-object v0, p1, Le/f/c/l/e/t/g/a;->a:Ljava/lang/String;

    iget-object p1, p1, Le/f/c/l/e/t/g/a;->c:Le/f/c/l/e/t/g/d;

    invoke-virtual {p0, p2, v0, p1}, Le/f/c/l/e/t/h/e;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Le/f/c/l/e/t/g/d;)Le/f/c/l/e/q/b;

    .line 4
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending report to: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 5
    :try_start_0
    invoke-virtual {p2}, Le/f/c/l/e/q/b;->b()Le/f/c/l/e/q/d;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/q/d;->b()I

    move-result p1

    .line 7
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Result was: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 8
    invoke-static {p1}, Le/f/c/l/e/m/w1;->a(I)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :catch_0
    move-exception p1

    .line 9
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "An invalid data collection token was used."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
