.class public Le/f/c/l/e/v/k/c;
.super Le/f/c/l/e/m/a;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/v/k/d;


# instance fields
.field public f:Le/f/c/l/e/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;)V
    .locals 6

    .line 1
    sget-object v4, Le/f/c/l/e/q/a;->b:Le/f/c/l/e/q/a;

    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Le/f/c/l/e/v/k/c;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;Le/f/c/l/e/b;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;Le/f/c/l/e/b;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Le/f/c/l/e/m/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;)V

    .line 3
    iput-object p5, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    return-void
.end method


# virtual methods
.method public final a(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/g;)Le/f/c/l/e/q/b;
    .locals 2

    .line 23
    iget-object v0, p2, Le/f/c/l/e/v/j/g;->a:Ljava/lang/String;

    const-string v1, "X-CRASHLYTICS-GOOGLE-APP-ID"

    invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v1, "android"

    .line 24
    invoke-virtual {p0, p1, v0, v1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-static {}, Le/f/c/l/e/m/b1;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"

    .line 26
    invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Accept"

    const-string v1, "application/json"

    .line 27
    invoke-virtual {p0, p1, v0, v1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    iget-object v0, p2, Le/f/c/l/e/v/j/g;->b:Ljava/lang/String;

    const-string v1, "X-CRASHLYTICS-DEVICE-MODEL"

    invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object v0, p2, Le/f/c/l/e/v/j/g;->c:Ljava/lang/String;

    const-string v1, "X-CRASHLYTICS-OS-BUILD-VERSION"

    invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v0, p2, Le/f/c/l/e/v/j/g;->d:Ljava/lang/String;

    const-string v1, "X-CRASHLYTICS-OS-DISPLAY-VERSION"

    invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object p2, p2, Le/f/c/l/e/v/j/g;->e:Le/f/c/l/e/m/r1;

    .line 32
    invoke-interface {p2}, Le/f/c/l/e/m/r1;->a()Ljava/lang/String;

    move-result-object p2

    const-string v0, "X-CRASHLYTICS-INSTALLATION-ID"

    .line 33
    invoke-virtual {p0, p1, v0, p2}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final a(Le/f/c/l/e/v/j/g;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/v/j/g;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    iget-object v1, p1, Le/f/c/l/e/v/j/g;->h:Ljava/lang/String;

    const-string v2, "build_version"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    iget-object v1, p1, Le/f/c/l/e/v/j/g;->g:Ljava/lang/String;

    const-string v2, "display_version"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget v1, p1, Le/f/c/l/e/v/j/g;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "source"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object p1, p1, Le/f/c/l/e/v/j/g;->f:Ljava/lang/String;

    .line 21
    invoke-static {p1}, Le/f/c/l/e/m/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "instance"

    .line 22
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public a(Le/f/c/l/e/q/d;)Lorg/json/JSONObject;
    .locals 4

    .line 11
    invoke-virtual {p1}, Le/f/c/l/e/q/d;->b()I

    move-result v0

    .line 12
    iget-object v1, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Settings result was: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0, v0}, Le/f/c/l/e/v/k/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {p1}, Le/f/c/l/e/q/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/c/l/e/v/k/c;->b(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to retrieve settings from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public a(Le/f/c/l/e/v/j/g;Z)Lorg/json/JSONObject;
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/v/j/g;)Ljava/util/Map;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p2}, Le/f/c/l/e/m/a;->a(Ljava/util/Map;)Le/f/c/l/e/q/b;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0, p1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/g;)Le/f/c/l/e/q/b;

    .line 4
    iget-object p1, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requesting settings from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Settings query params were: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Le/f/c/l/e/q/b;->b()Le/f/c/l/e/q/d;

    move-result-object p1

    .line 7
    iget-object p2, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Settings request ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "X-REQUEST-ID"

    invoke-virtual {p1, v1}, Le/f/c/l/e/q/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, p1}, Le/f/c/l/e/v/k/c;->a(Le/f/c/l/e/q/d;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    iget-object p2, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    const-string v0, "Settings request failed."

    invoke-virtual {p2, v0, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "An invalid data collection token was used."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Le/f/c/l/e/q/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p3, :cond_0

    .line 34
    invoke-virtual {p1, p2, p3}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    :cond_0
    return-void
.end method

.method public a(I)Z
    .locals 1

    const/16 v0, 0xc8

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xca

    if-eq p1, v0, :cond_1

    const/16 v0, 0xcb

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse settings JSON from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    iget-object v0, p0, Le/f/c/l/e/v/k/c;->f:Le/f/c/l/e/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Settings response "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method