.class public Le/f/c/l/e/v/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/v/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Le/f/c/l/e/m/h1;JLorg/json/JSONObject;)J
    .locals 4

    const-string v0, "expires_at"

    .line 24
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 25
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide p0

    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p0}, Le/f/c/l/e/m/h1;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long p1, p1, v2

    add-long p0, v0, p1

    :goto_0
    return-wide p0
.end method

.method public static a(Lorg/json/JSONObject;Lorg/json/JSONObject;)Le/f/c/l/e/v/j/b;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "status"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "new"

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "bundle_id"

    .line 12
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "org_id"

    .line 13
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 p0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "https://update.crashlytics.com/spi/v1/platforms/android/apps"

    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v3, p0, [Ljava/lang/Object;

    aput-object v6, v3, v1

    const-string v4, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s"

    invoke-static {v0, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v3, v0

    .line 15
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, p0, [Ljava/lang/Object;

    aput-object v6, v4, v1

    const-string v5, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports"

    invoke-static {v0, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 16
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p0, p0, [Ljava/lang/Object;

    aput-object v6, p0, v1

    const-string v5, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps"

    invoke-static {v0, v5, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string p0, "update_required"

    .line 17
    invoke-virtual {p1, p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    const-string p0, "report_upload_variant"

    .line 18
    invoke-virtual {p1, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    const-string p0, "native_report_upload_variant"

    .line 19
    invoke-virtual {p1, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v10

    .line 20
    new-instance p0, Le/f/c/l/e/v/j/b;

    move-object v1, p0

    invoke-direct/range {v1 .. v10}, Le/f/c/l/e/v/j/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZII)V

    return-object p0
.end method

.method public static a(Lorg/json/JSONObject;)Le/f/c/l/e/v/j/c;
    .locals 2

    const-string v0, "collect_reports"

    const/4 v1, 0x1

    .line 21
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p0

    .line 22
    new-instance v0, Le/f/c/l/e/v/j/c;

    invoke-direct {v0, p0}, Le/f/c/l/e/v/j/c;-><init>(Z)V

    return-object v0
.end method

.method public static a()Le/f/c/l/e/v/j/d;
    .locals 3

    .line 23
    new-instance v0, Le/f/c/l/e/v/j/d;

    const/16 v1, 0x8

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Le/f/c/l/e/v/j/d;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public a(Le/f/c/l/e/m/h1;Lorg/json/JSONObject;)Le/f/c/l/e/v/j/f;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "settings_version"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    const-string v0, "cache_duration"

    const/16 v1, 0xe10

    .line 2
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    const-string v0, "fabric"

    .line 3
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "app"

    .line 4
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 5
    invoke-static {v0, v1}, Le/f/c/l/e/v/i;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)Le/f/c/l/e/v/j/b;

    move-result-object v5

    .line 6
    invoke-static {}, Le/f/c/l/e/v/i;->a()Le/f/c/l/e/v/j/d;

    move-result-object v6

    const-string v0, "features"

    .line 7
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Le/f/c/l/e/v/i;->a(Lorg/json/JSONObject;)Le/f/c/l/e/v/j/c;

    move-result-object v7

    int-to-long v0, v9

    .line 8
    invoke-static {p1, v0, v1, p2}, Le/f/c/l/e/v/i;->a(Le/f/c/l/e/m/h1;JLorg/json/JSONObject;)J

    move-result-wide v3

    .line 9
    new-instance p1, Le/f/c/l/e/v/j/f;

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Le/f/c/l/e/v/j/f;-><init>(JLe/f/c/l/e/v/j/b;Le/f/c/l/e/v/j/d;Le/f/c/l/e/v/j/c;II)V

    return-object p1
.end method
