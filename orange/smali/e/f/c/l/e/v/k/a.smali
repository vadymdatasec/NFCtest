.class public abstract Le/f/c/l/e/v/k/a;
.super Le/f/c/l/e/m/a;
.source "SourceFile"


# instance fields
.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Le/f/c/l/e/m/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;)V

    .line 2
    iput-object p5, p0, Le/f/c/l/e/v/k/a;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/a;)Le/f/c/l/e/q/b;
    .locals 2

    .line 15
    iget-object v0, p2, Le/f/c/l/e/v/j/a;->a:Ljava/lang/String;

    const-string v1, "X-CRASHLYTICS-ORG-ID"

    .line 16
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object p2, p2, Le/f/c/l/e/v/j/a;->b:Ljava/lang/String;

    const-string v0, "X-CRASHLYTICS-GOOGLE-APP-ID"

    .line 17
    invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    const-string p2, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v0, "android"

    .line 18
    invoke-virtual {p1, p2, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object p2, p0, Le/f/c/l/e/v/k/a;->f:Ljava/lang/String;

    const-string v0, "X-CRASHLYTICS-API-CLIENT-VERSION"

    .line 19
    invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    return-object p1
.end method

.method public a(Le/f/c/l/e/v/j/a;Z)Z
    .locals 3

    if-eqz p2, :cond_2

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/a;->a()Le/f/c/l/e/q/b;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p2, p1}, Le/f/c/l/e/v/k/a;->a(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/a;)Le/f/c/l/e/q/b;

    .line 3
    invoke-virtual {p0, p2, p1}, Le/f/c/l/e/v/k/a;->b(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/a;)Le/f/c/l/e/q/b;

    .line 4
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending app info to "

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

    move-result v0

    const-string v1, "POST"

    .line 7
    invoke-virtual {p2}, Le/f/c/l/e/q/b;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Create"

    goto :goto_0

    :cond_0
    const-string p2, "Update"

    .line 8
    :goto_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " app request ID: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "X-REQUEST-ID"

    .line 9
    invoke-virtual {p1, p2}, Le/f/c/l/e/q/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 10
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Result was "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 11
    invoke-static {v0}, Le/f/c/l/e/m/w1;->a(I)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    :catch_0
    move-exception p1

    .line 12
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p2

    const-string v0, "HTTP request failed."

    invoke-virtual {p2, v0, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 14
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "An invalid data collection token was used."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/a;)Le/f/c/l/e/q/b;
    .locals 2

    .line 1
    iget-object v0, p2, Le/f/c/l/e/v/j/a;->a:Ljava/lang/String;

    const-string v1, "org_id"

    .line 2
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object v0, p2, Le/f/c/l/e/v/j/a;->c:Ljava/lang/String;

    const-string v1, "app[identifier]"

    .line 3
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object v0, p2, Le/f/c/l/e/v/j/a;->g:Ljava/lang/String;

    const-string v1, "app[name]"

    .line 4
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object v0, p2, Le/f/c/l/e/v/j/a;->d:Ljava/lang/String;

    const-string v1, "app[display_version]"

    .line 5
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object v0, p2, Le/f/c/l/e/v/j/a;->e:Ljava/lang/String;

    const-string v1, "app[build_version]"

    .line 6
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget v0, p2, Le/f/c/l/e/v/j/a;->h:I

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "app[source]"

    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object v0, p2, Le/f/c/l/e/v/j/a;->i:Ljava/lang/String;

    const-string v1, "app[minimum_sdk_version]"

    .line 8
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    iget-object v0, p2, Le/f/c/l/e/v/j/a;->j:Ljava/lang/String;

    const-string v1, "app[built_sdk_version]"

    .line 9
    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    .line 10
    iget-object v0, p2, Le/f/c/l/e/v/j/a;->f:Ljava/lang/String;

    invoke-static {v0}, Le/f/c/l/e/m/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 11
    iget-object p2, p2, Le/f/c/l/e/v/j/a;->f:Ljava/lang/String;

    const-string v0, "app[instance_identifier]"

    invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    :cond_0
    return-object p1
.end method