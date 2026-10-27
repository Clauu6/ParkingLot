<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<header class="p-3 bg-dark text-white">
  <div class="container">
    <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
      <ul class="nav nav-pills me-auto">
        <li class="nav-item">
          <a href="${pageContext.request.contextPath}/" class="nav-link ${activePage eq 'Home' ? 'active' : 'text-white'}">Parking Lot</a>
        </li>
        <li class="nav-item">
          <a href="${pageContext.request.contextPath}/About" class="nav-link ${activePage eq 'About' ? 'active' : 'text-white'}">About</a>
        </li>
        <li class="nav-item">
          <a href="${pageContext.request.contextPath}/Cars" class="nav-link ${activePage eq 'Cars' ? 'active' : 'text-white'}">Cars</a>
        </li>
      </ul>
    </div>
  </div>
</header>