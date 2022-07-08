package gatling_simulations

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class cloudThing extends Simulation {

	val httpProtocol = http
		.baseUrl("https://maps.googleapis.com")
		.inferHtmlResources()

	val headers_1 = Map(
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_49 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36")

	val headers_53 = Map(
		"Origin" -> "https://kerv.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_64 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36")

	val headers_66 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "iframe",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_67 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "text/plain",
		"Origin" -> "https://kerv.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_68 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "text/plain; charset=UTF-8",
		"Origin" -> "https://kerv.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_69 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_82 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36")

	val headers_92 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain",
		"origin" -> "https://kerv.com",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36")

	val headers_93 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-None-Match" -> "W/c216e637750a0e64cbb9f1bf2cd8e851",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """.Not/A)Brand";v="99", "Google Chrome";v="103", "Chromium";v="103""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

    val uri01 = "https://ws20.hotjar.com/api/v2/sites/2988060/recordings/content"
    val uri02 = "https://kerv.com"
    val uri03 = "https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
    val uri04 = "http://cloudthing.com"
    val uri05 = "https://vars.hotjar.com/box-5e0db0f25ef573fe233efc0372d38d69.html"
    val uri06 = "https://www.googletagmanager.com/gtm.js"
    val uri07 = "https://secure.livechatinc.com/customer/action/open_chat"
    val uri08 = "https://script.hotjar.com/modules.e691815239005b70eaea.js"
    val uri10 = "https://www.google-analytics.com"
    val uri11 = "https://cdn.livechatinc.com"
    val uri12 = "https://api.livechatinc.com/v3.3/customer/action"
    val uri13 = "https://static.hotjar.com/c/hotjar-2988060.js"
    val uri14 = "https://fonts.gstatic.com/s/notosans/v27"
    val uri15 = "https://mktdplp102cdn.azureedge.net/public/latest/js"
    val uri16 = "https://0e48e50fde834666b54dcbd673770ea3.svc.dynamics.com"
    val uri17 = "https://fonts.googleapis.com/css"
    val uri18 = "https://in.hotjar.com/api/v2/client/sites/2988060/visit-data"

	val scn = scenario("cloudThing")
		.exec(http("request_0")
			.get(uri04 + "/")
			.resources(http("request_1")
			.get(uri02 + "/app/themes/kerv-group/dist/js/main.js?ver=a9447bd6fcad109f78140a603b0758d0d8e4c85a")
			.headers(headers_1),
            http("request_2")
			.get(uri02 + "/app/plugins/borlabs-cookie/assets/javascript/borlabs-cookie-prioritize.min.js?ver=2.2.49")
			.headers(headers_1),
            http("request_3")
			.get(uri02 + "/app/uploads/2022/05/Kerv-Birmingham-Office.jpg")
			.headers(headers_1),
            http("request_4")
			.get(uri02 + "/app/uploads/2022/05/Kerv-Birmingham-Office2.jpg")
			.headers(headers_1),
            http("request_5")
			.get(uri02 + "/app/uploads/2022/04/Kerv_Animation_2_Final_4K_ProRes-CORK-SCREW-0-00-02-23-scaled.jpg")
			.headers(headers_1),
            http("request_6")
			.get(uri02 + "/app/uploads/2022/04/cloudThing_KervDigital__3x.jpg")
			.headers(headers_1),
            http("request_7")
			.get(uri02 + "/app/uploads/2022/03/NEW-_Solutions-Digital-business.png")
			.headers(headers_1),
            http("request_8")
			.get(uri02 + "/app/uploads/2022/03/CX-Logos_Expectations.png")
			.headers(headers_1),
            http("request_9")
			.get(uri02 + "/app/uploads/2022/03/Values-Be-Bold.png")
			.headers(headers_1),
            http("request_10")
			.get(uri02 + "/app/uploads/2022/03/NEW-_Solutions-Transformed-secure-infrastructure.png")
			.headers(headers_1),
            http("request_11")
			.get(uri02 + "/app/uploads/2022/03/CX-Logos_Resolution.png")
			.headers(headers_1),
            http("request_12")
			.get(uri02 + "/app/uploads/2022/03/Values-Do-the-Right-Thing.png")
			.headers(headers_1),
            http("request_13")
			.get(uri02 + "/app/uploads/2022/04/12-1.jpg")
			.headers(headers_1),
            http("request_14")
			.get(uri02 + "/app/uploads/2022/04/rob-meehan-1.jpg")
			.headers(headers_1),
            http("request_15")
			.get(uri02 + "/app/uploads/2022/04/vedha-bharathi-1.jpg")
			.headers(headers_1),
            http("request_16")
			.get(uri02 + "/app/uploads/2022/04/bala-jagannathan.jpg")
			.headers(headers_1),
            http("request_17")
			.get(uri02 + "/app/uploads/2022/04/mike-wrought.jpg")
			.headers(headers_1),
            http("request_18")
			.get(uri02 + "/app/uploads/2022/04/jane-rudge.jpg")
			.headers(headers_1),
            http("request_19")
			.get(uri02 + "/app/uploads/2022/04/tony-leary.jpg")
			.headers(headers_1),
            http("request_20")
			.get(uri02 + "/app/uploads/2022/04/will-dorrington.jpg")
			.headers(headers_1),
            http("request_21")
			.get(uri02 + "/app/uploads/2022/04/Jon-Paul-McSporran-scaled.jpg")
			.headers(headers_1),
            http("request_22")
			.get(uri02 + "/app/uploads/2022/03/delivery-man-in-van-on-a-tablet.jpg")
			.headers(headers_1),
            http("request_23")
			.get(uri02 + "/app/uploads/2022/04/Two-man-sat-at-laptop-smilling-scaled.jpg")
			.headers(headers_1),
            http("request_24")
			.get(uri02 + "/app/uploads/2022/03/woman-raising-hand-in-a-lecture.jpg")
			.headers(headers_1),
            http("request_25")
			.get(uri02 + "/app/uploads/2022/03/woman-smiling-working-at-her-laptop-scaled.jpg")
			.headers(headers_1),
            http("request_26")
			.get(uri02 + "/app/uploads/2022/02/Kerv_divisional-logo_Collaborate_Purple_RGB-e1649781358819-1024x415.png")
			.headers(headers_1),
            http("request_27")
			.get(uri02 + "/app/uploads/2022/02/Kerv_divisional-logo_Transform_Purple_RGB-1-e1646133158416-1024x448.png")
			.headers(headers_1),
            http("request_28")
			.get(uri02 + "/app/uploads/2022/02/Kerv_divisional-logo_Experience_Purple_RGB-1-e1648542554935-1024x423.png")
			.headers(headers_1),
            http("request_29")
			.get(uri02 + "/app/uploads/2022/04/Kerv_divisional-logo_Transform_Purple_RGB_Transform_Purple_RGB.png")
			.headers(headers_1),
            http("request_30")
			.get(uri02 + "/app/uploads/2022/02/footer-bg-e1649351827507.png")
			.headers(headers_1),
            http("request_31")
			.get(uri02 + "/app/uploads/2022/02/Kerv_Reversed_STRAP_RGB.png")
			.headers(headers_1),
            http("request_32")
			.get(uri02 + "/app/uploads/2021/10/linkedin.png")
			.headers(headers_1),
            http("request_33")
			.get(uri02 + "/app/uploads/2021/10/twitter.png")
			.headers(headers_1),
            http("request_34")
			.get(uri02 + "/wp/wp-includes/js/dist/vendor/regenerator-runtime.min.js?ver=0.13.9")
			.headers(headers_1),
            http("request_35")
			.get(uri02 + "/wp/wp-includes/js/dist/vendor/wp-polyfill.min.js?ver=3.15.0")
			.headers(headers_1),
            http("request_36")
			.get(uri02 + "/wp/wp-includes/js/dist/dom-ready.min.js?ver=ecda74de0221e1c2ce5c57cbb5af09d5")
			.headers(headers_1),
            http("request_37")
			.get(uri02 + "/wp/wp-includes/js/dist/hooks.min.js?ver=1e58c8c5a32b2e97491080c5b10dc71c")
			.headers(headers_1),
            http("request_38")
			.get(uri02 + "/wp/wp-includes/js/dist/i18n.min.js?ver=30fcecb428a0e8383d3776bcdd3a7834")
			.headers(headers_1),
            http("request_39")
			.get(uri02 + "/wp/wp-includes/js/dist/a11y.min.js?ver=68e470cf840f69530e9db3be229ad4b6")
			.headers(headers_1),
            http("request_40")
			.get(uri02 + "/wp/wp-includes/js/jquery/jquery.min.js?ver=3.6.0")
			.headers(headers_1),
            http("request_41")
			.get(uri02 + "/wp/wp-includes/js/jquery/jquery-migrate.min.js?ver=3.3.2")
			.headers(headers_1),
            http("request_42")
			.get(uri02 + "/app/plugins/gravityforms/js/jquery.json.min.js?ver=2.5.15.2")
			.headers(headers_1),
            http("request_43")
			.get(uri02 + "/app/plugins/gravityforms/js/gravityforms.min.js?ver=2.5.15.2")
			.headers(headers_1),
            http("request_44")
			.get(uri02 + "/app/plugins/borlabs-cookie/assets/javascript/borlabs-cookie.min.js?ver=2.2.49")
			.headers(headers_1),
            http("request_45")
			.get(uri02 + "/wp/wp-includes/css/dist/block-library/style.min.css?ver=5.9.3"),
            http("request_46")
			.get(uri03),
            http("request_47")
			.get(uri02 + "/app/cache/borlabs-cookie/borlabs-cookie_1_en.css?ver=2.2.49-15"),
            http("request_48")
			.get(uri02 + "/app/themes/kerv-group/dist/css/style.css?ver=a9447bd6fcad109f78140a603b0758d0d8e4c85a"),
            http("request_49")
			.get(uri15 + "/ws-tracking.js?v=1.77.1005")
			.headers(headers_49),
            http("request_50")
			.get(uri15 + "/form-loader.js?v=1.77.1005")
			.headers(headers_49),
            http("request_51")
			.get("/maps/api/js?key=AIzaSyDyOIM2ppRp-uTc7XLdQ1Y3PE4FvrzvT7E"),
            http("request_52")
			.get(uri06 + "?id=GTM-KMSQH35"),
            http("request_53")
			.get(uri02 + "/app/themes/kerv-group/fonts/AeonikPro-Bold_1.woff2")
			.headers(headers_53),
            http("request_54")
			.get(uri02 + "/app/themes/kerv-group/fonts/AeonikPro-Light_1.woff2")
			.headers(headers_53),
            http("request_55")
			.get(uri02 + "/app/themes/kerv-group/fonts/AeonikPro-Regular_1.woff2")
			.headers(headers_53),
            http("request_56")
			.get(uri02 + "/app/themes/kerv-group/fonts/Geomanist.woff2")
			.headers(headers_53),
            http("request_57")
			.get(uri02 + "/app/themes/kerv-group/images/icons/cross.svg")
			.headers(headers_1),
            http("request_58")
			.get(uri02 + "/app/themes/kerv-group/images/testimonial-bg.jpg")
			.headers(headers_1),
            http("request_59")
			.get(uri02 + "/app/uploads/2022/04/cropped-kerv-favicon.png")
			.headers(headers_1),
            http("request_60")
			.get(uri10 + "/analytics.js"),
            http("request_61")
			.get(uri13 + "?sv=7"),
            http("request_62")
			.get(uri11 + "/tracking.js"),
            http("request_63")
			.get(uri08),
            http("request_64")
			.get(uri10 + "/collect?v=1&_v=j96&a=2041891302&t=pageview&_s=1&dl=https%3A%2F%2Fkerv.com%2Fabout-kerv%2Fkerv-divisions%2Fkerv-digital&ul=en-us&de=UTF-8&dt=Kerv%20Divisions%20%7C%20Kerv%20Digital%20%7C%20Kerv&sd=24-bit&sr=1536x864&vp=825x731&je=0&_u=QACAAEAB~&jid=&gjid=&cid=344170866.1657289604&tid=UA-195136461-1&_gid=615784873.1657289604&gtm=2wg6t0KMSQH35&z=1134391108")
			.headers(headers_64),
            http("request_65")
			.get(uri05),
            http("request_66")
			.get(uri16 + "/t/c/qvqXTBx3hTPeKpBIsoZxGstwDY2_gZY6jpQP9Rz1HaY/B-JW3WTSGL-SiMRLYba-KJXkYyzZztldw3QrqyBz/pLk9Zvta?trackwebsitevisited=true&ad=https%3A%2F%2Fkerv.com%2Fabout-kerv%2Fkerv-divisions%2Fkerv-digital&rf=&id=8463639600")
			.headers(headers_66),
            http("request_67")
			.post(uri16 + "/f/cv/qvqXTBx3hTPeKpBIsoZxGstwDY2_gZY6jpQP9Rz1HaY/c/A33XmtzaZJhnkYerEtJkkLv1aJ-De3gMLjAP1EVUg-U")
			.headers(headers_67)
			.body(RawFileBody("gatling_simulations/cloudthing/0067_request.txt")),
            http("request_68")
			.post(uri18 + "?sv=7")
			.headers(headers_68)
			.body(RawFileBody("gatling_simulations/cloudthing/0068_request.txt")),
            http("request_69")
			.get(uri12 + "/get_dynamic_configuration?license_id=14041266&url=https%3A%2F%2Fkerv.com%2Fabout-kerv%2Fkerv-divisions%2Fkerv-digital&channel_type=code&jsonp=__irvse5c6u8")
			.headers(headers_69),
            http("request_70")
			.get(uri12 + "/get_configuration?license_id=14041266&version=84.1.1.139.16.35.7.2.2.1.2.5&group_id=0&jsonp=__lc_static_config"),
            http("request_71")
			.get(uri12 + "/get_localization?license_id=14041266&version=ff93808ef52c6dd040640c4853b854bd_934e30f4f329f0f6b42ad431459ffe45&language=en&group_id=0&jsonp=__lc_localization"),
            http("request_72")
			.get(uri07 + "?license_id=14041266&group=0&embedded=1&widget_version=3&unique_groups=0")
			.headers(headers_66),
            http("request_73")
			.post(uri01)
			.headers(headers_68)))
		.pause(1)
		.exec(http("request_74")
			.get(uri17 + "?family=Noto+Sans:400,700&subset=latin-ext&display=swap")
			.headers(headers_1)
			.resources(http("request_75")
			.get(uri11 + "/widget/static/js/0.5d78072a.chunk.js")
			.headers(headers_1),
            http("request_76")
			.get(uri11 + "/widget/static/js/2.288ab811.chunk.js")
			.headers(headers_1),
            http("request_77")
			.get(uri11 + "/widget/static/js/iframe.49874808.chunk.js")
			.headers(headers_1),
            http("request_78")
			.get(uri14 + "/o-0IIpQlx3QUlC5A4PNr5TRA.woff2"),
            http("request_79")
			.get(uri14 + "/o-0NIpQlx3QUlC5A4PNjXhFVZNyB.woff2")))
		.pause(1)
		.exec(http("request_80")
			.get("/maps-api-v3/api/js/49/8/util.js")
			.resources(http("request_81")
			.get("/maps-api-v3/api/js/49/8/common.js")))
		.pause(8)
		.exec(http("request_82")
			.get(uri02 + "/?s=mobile")
			.headers(headers_82)
			.resources(http("request_83")
			.get(uri06 + "?id=GTM-KMSQH35"),
            http("request_84")
			.get(uri02 + "/app/themes/kerv-group/fonts/AeonikPro-Bold_1.woff2")
			.headers(headers_53),
            http("request_85")
			.get(uri02 + "/app/themes/kerv-group/fonts/AeonikPro-Light_1.woff2")
			.headers(headers_53),
            http("request_86")
			.get(uri02 + "/app/themes/kerv-group/fonts/AeonikPro-Regular_1.woff2")
			.headers(headers_53),
            http("request_87")
			.get(uri02 + "/app/themes/kerv-group/fonts/Geomanist.woff2")
			.headers(headers_53),
            http("request_88")
			.get(uri02 + "/app/themes/kerv-group/images/icons/cross.svg")
			.headers(headers_1),
            http("request_89")
			.get(uri02 + "/app/uploads/2022/04/cropped-kerv-favicon.png")
			.headers(headers_1),
            http("request_90")
			.get(uri10 + "/analytics.js"),
            http("request_91")
			.get(uri11 + "/tracking.js"),
            http("request_92")
			.post(uri10 + "/j/collect?v=1&_v=j96&a=566813974&t=pageview&_s=1&dl=https%3A%2F%2Fkerv.com%2F%3Fs%3Dmobile&ul=en-us&de=UTF-8&dt=You%20searched%20for%20mobile%20-%20Kerv%20Group&sd=24-bit&sr=1536x864&vp=825x731&je=0&_u=QACAAEABAAAAAC~&jid=1100577793&gjid=1680378120&cid=344170866.1657289604&tid=UA-195136461-1&_gid=615784873.1657289604&_r=1&gtm=2wg6t0KMSQH35&z=298952755")
			.headers(headers_92),
            http("request_93")
			.get(uri13 + "?sv=7")
			.headers(headers_93),
            http("request_94")
			.get(uri08),
            http("request_95")
			.get(uri05),
            http("request_96")
			.get(uri12 + "/get_dynamic_configuration?license_id=14041266&url=https%3A%2F%2Fkerv.com%2F%3Fs%3Dmobile&channel_type=code&jsonp=__z48jql0o1nr")
			.headers(headers_69),
            http("request_97")
			.get(uri16 + "/t/c/qvqXTBx3hTPeKpBIsoZxGstwDY2_gZY6jpQP9Rz1HaY/B-JW3WTSGL-SiMRLYba-KJXkYyzZztldw3QrqyBz/pLk9Zvta?trackwebsitevisited=true&ad=https%3A%2F%2Fkerv.com%2F%3Fs%3Dmobile&rf=https%3A%2F%2Fkerv.com%2Fabout-kerv%2Fkerv-divisions%2Fkerv-digital&id=9559146741")
			.headers(headers_66),
            http("request_98")
			.get(uri12 + "/get_configuration?license_id=14041266&version=84.1.1.139.16.35.7.2.2.1.2.5&group_id=0&jsonp=__lc_static_config"),
            http("request_99")
			.post(uri18 + "?sv=7")
			.headers(headers_68)
			.body(RawFileBody("gatling_simulations/cloudthing/0099_request.txt")),
            http("request_100")
			.get(uri12 + "/get_localization?license_id=14041266&version=ff93808ef52c6dd040640c4853b854bd_934e30f4f329f0f6b42ad431459ffe45&language=en&group_id=0&jsonp=__lc_localization"),
            http("request_101")
			.post(uri16 + "/f/cv/qvqXTBx3hTPeKpBIsoZxGstwDY2_gZY6jpQP9Rz1HaY/c/zdBR_0zmFARgxsFzVkNJsuHKO7KlESvoAqMbkRDLDYs")
			.headers(headers_67)
			.body(RawFileBody("gatling_simulations/cloudthing/0101_request.txt")),
            http("request_102")
			.get(uri07 + "?license_id=14041266&group=0&embedded=1&widget_version=3&unique_groups=0")
			.headers(headers_66),
            http("request_103")
			.get(uri17 + "?family=Noto+Sans:400,700&subset=latin-ext&display=swap")
			.headers(headers_1),
            http("request_104")
			.get(uri11 + "/widget/static/js/0.5d78072a.chunk.js")
			.headers(headers_1),
            http("request_105")
			.get(uri11 + "/widget/static/js/2.288ab811.chunk.js")
			.headers(headers_1),
            http("request_106")
			.get(uri11 + "/widget/static/js/iframe.49874808.chunk.js")
			.headers(headers_1),
            http("request_107")
			.get(uri14 + "/o-0IIpQlx3QUlC5A4PNr5TRA.woff2"),
            http("request_108")
			.get(uri14 + "/o-0NIpQlx3QUlC5A4PNjXhFVZNyB.woff2"),
            http("request_109")
			.post(uri01)
			.headers(headers_68)
			.body(RawFileBody("gatling_simulations/cloudthing/0109_request.txt"))))
		.pause(3)
		.exec(http("request_110")
			.get("/maps-api-v3/api/js/49/8/util.js")
			.resources(http("request_111")
			.get("/maps-api-v3/api/js/49/8/common.js")))

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}